package com.Relacionamentos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String cidade;

    private String telefone;

    private String ra;

    private Double renda;

    @ManyToOne
    @JoinColumn(name = "id_turma")
    private Turma turma;
}