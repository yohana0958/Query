package com.Relacionamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Relacionamentos.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}