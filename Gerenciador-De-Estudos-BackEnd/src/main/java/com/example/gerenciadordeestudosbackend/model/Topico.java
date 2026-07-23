package com.example.gerenciadordeestudosbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.CascadeType.ALL;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String descricao;

    private Integer nivelDominio;

    private Integer estimativaHoras;

    @ManyToOne
    @JoinColumn(name = "materia_id")
    private Materia materia;

    @OneToMany(cascade=ALL, mappedBy="topico")
    private List<Tarefa> tarefas = new ArrayList<>();

    @OneToMany(cascade=ALL, mappedBy="topico")
    private List<Revisao> revisoes = new ArrayList<>();

    @OneToMany(cascade=ALL, mappedBy="topico")
    private List<Flashcard> flashcards = new ArrayList<>();

    @OneToMany(cascade=ALL, mappedBy="topico")
    private List<SessaoEstudo> sessoes = new ArrayList<>();
}
