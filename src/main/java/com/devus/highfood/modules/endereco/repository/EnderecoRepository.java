package com.devus.highfood.modules.endereco.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.devus.highfood.modules.endereco.model.EnderecoEntity;

@Repository
public interface EnderecoRepository extends CrudRepository<EnderecoEntity, Integer> {
    
}
