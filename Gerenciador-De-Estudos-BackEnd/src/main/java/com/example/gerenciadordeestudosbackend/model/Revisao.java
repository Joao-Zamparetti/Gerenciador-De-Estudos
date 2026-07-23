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
public class Revisao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dataProgramada;

    private Date dataRealizada;

    private Integer intervaloDias;

    private String status;

    @ManyToOne
    @JoinColumn(name = "topico_id")
    private Topico topico;
}
