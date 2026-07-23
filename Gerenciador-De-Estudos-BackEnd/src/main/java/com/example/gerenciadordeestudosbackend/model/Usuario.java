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
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String senha;

    private String fotoDePerfil;

    @OneToMany(cascade=ALL, mappedBy="usuario")
    private List<Materia> materias = new ArrayList<>();

    @OneToMany(cascade=ALL, mappedBy="usuario")
    private List<SessaoEstudo> sessoes = new ArrayList<>();

    @OneToMany(cascade=ALL, mappedBy="usuario")
    private List<Meta> metas = new ArrayList<>();

    @OneToMany(cascade=ALL, mappedBy="usuario")
    private List<EventoCalendario> eventos = new ArrayList<>();

    @OneToMany(cascade=ALL, mappedBy="usuario")
    private List<Notificacao> notificacoes = new ArrayList<>();
}
