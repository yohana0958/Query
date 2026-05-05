package com.Relacionamentos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Relacionamentos.entity.Turma;
import com.Relacionamentos.repository.TurmaRepository;

@Service
public class TurmaService {

    private TurmaRepository repository;

    public TurmaService(TurmaRepository repository) {
        this.repository = repository;
    }

    public Turma salvar(Turma turma) {
        return repository.save(turma);
    }

    public List<Turma> listar() {
        return repository.findAll();
    }

    public Turma buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}