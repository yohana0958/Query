package com.Relacionamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Relacionamentos.entity.Telefone;

public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}