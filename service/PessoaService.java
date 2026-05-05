package com.Relacionamentos.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.Relacionamentos.entity.Pessoa;
import com.Relacionamentos.repository.PessoaRepository;

@Service
public class PessoaService {

    private PessoaRepository repository;

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    public Pessoa salvar(Pessoa pessoa) {
        return repository.save(pessoa);
    }

    public List<Pessoa> listar() {
        return repository.findAll();
    }

    public Pessoa buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}