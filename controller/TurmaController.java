package com.Relacionamentos.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;

import com.Relacionamentos.entity.Turma;
import com.Relacionamentos.service.TurmaService;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    private TurmaService service;

    public TurmaController(TurmaService service) {
        this.service = service;
    }

    @PostMapping
    public Turma salvar(@RequestBody Turma turma) {
        return service.salvar(turma);
    }

    @GetMapping
    public List<Turma> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Turma buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}