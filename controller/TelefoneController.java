package com.Relacionamentos.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.Relacionamentos.entity.Telefone;
import com.Relacionamentos.service.TelefoneService;

@RestController
@RequestMapping("/telefones")
public class TelefoneController {

    private TelefoneService service;

    public TelefoneController(TelefoneService service) {
        this.service = service;
    }

    @PostMapping("/")
    public Telefone salvar(@RequestBody Telefone telefone) {
        return service.salvar(telefone);
    }

    @GetMapping
    public List<Telefone> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Telefone buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}