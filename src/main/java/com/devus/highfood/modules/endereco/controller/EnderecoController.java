package com.devus.highfood.modules.endereco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.devus.highfood.modules.endereco.service.EnderecoService;

@RestController
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping ("/busca/{cep}")
    public Object getEndereco(@PathVariable String cep){

        var resposta = enderecoService.register(cep);
        return resposta == null ? "Cep not found" : resposta;
    }
}
