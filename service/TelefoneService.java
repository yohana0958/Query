package com.Relacionamentos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Relacionamentos.entity.Pessoa;
import com.Relacionamentos.entity.Telefone;
import com.Relacionamentos.repository.PessoaRepository;
import com.Relacionamentos.repository.TelefoneRepository;

@Service
public class TelefoneService {

    private TelefoneRepository telefoneRepository;

    public TelefoneService(TelefoneRepository telefoneRepository, PessoaRepository pessoaRepository) {
        this.telefoneRepository = telefoneRepository;
    }

    public List<Telefone> listar() {
        return telefoneRepository.findAll();
    }

    public Telefone buscarPorId(Long id) {
        Optional<Telefone> telefone = telefoneRepository.findById(id);
        return telefone.orElse(null);
    }

    public Telefone salvar(Telefone telefone) {
        return telefoneRepository.save(telefone);
    }

    public void deletar(Long id) {
        telefoneRepository.deleteById(id);
    }
}