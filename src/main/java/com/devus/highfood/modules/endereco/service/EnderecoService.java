package com.devus.highfood.modules.endereco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.devus.highfood.modules.endereco.model.EnderecoEntity;
import com.devus.highfood.modules.endereco.repository.EnderecoRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public EnderecoEntity register(String cep) {
        try {

            RestTemplate restTemplate = new RestTemplate();
            RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
            restTemplate = restTemplateBuilder.build();
            var payload = restTemplate.getForObject("https://viacep.com.br/ws/" + cep + "/json/",
                    EnderecoEntity.class);

            payload.getCep().equals(null);

            payload = enderecoRepository.save(payload);
            return payload;

        } catch (Exception e) {
            return null;
        }
    }
}
