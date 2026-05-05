package com.Relacionamentos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Relacionamentos.entity.Aluno;
import com.Relacionamentos.repository.AlunoRepository;

@Service
public class AlunoService {

    private AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public Aluno salvar(Aluno aluno) {
        return repository.save(aluno);
    }

    public List<Aluno> listar() {
        return repository.findAll();
    }

    public Aluno buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
    public List<Aluno> buscarAlunosPorCidade(String cidade) {
        return repository.findByCidade(cidade);

    }
}