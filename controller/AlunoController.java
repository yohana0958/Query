package com.Relacionamentos.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Relacionamentos.entity.Aluno;
import com.Relacionamentos.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private AlunoService service;

    public AlunoController(AlunoService service) {
        this.service = service;
    }

    @PostMapping
    public Aluno salvar(@RequestBody Aluno aluno) {
        return service.salvar(aluno);
    }

    @GetMapping
    public List<Aluno> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Aluno buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
    @GetMapping("/cidade/{cidade}")
    public ResponseEntity<List<Aluno>> buscarAlunosPorCidade(@PathVariable String cidade) {
        List<Aluno> alunos = service.buscarAlunosPorCidade(cidade);
        return ResponseEntity.ok(alunos);

    }
}