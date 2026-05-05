package com.Relacionamentos.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.Relacionamentos.entity.Pessoa;
import com.Relacionamentos.service.PessoaService;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private PessoaService service;

    public PessoaController(PessoaService service) {
        this.service = service;
    }

    @PostMapping
    public Pessoa salvar(@RequestBody Pessoa pessoa) {
        return service.salvar(pessoa);
    }

    @GetMapping
    public List<Pessoa> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Pessoa buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
