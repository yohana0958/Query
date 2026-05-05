package com.Relacionamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Relacionamentos.entity.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Long> {
}