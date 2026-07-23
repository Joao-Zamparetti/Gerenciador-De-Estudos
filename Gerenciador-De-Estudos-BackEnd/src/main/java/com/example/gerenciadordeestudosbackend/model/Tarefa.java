package com.example.gerenciadordeestudosbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String descricao;

    private String status;

    private Integer prioridade;

    private Integer tempoEstimadas;

    private Date prazo;

    @ManyToOne
    @JoinColumn(name = "topico_id")
    private Topico topico;

}
