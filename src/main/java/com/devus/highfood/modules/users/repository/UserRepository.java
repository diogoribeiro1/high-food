package com.devus.highfood.modules.users.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.devus.highfood.modules.users.model.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer>{    
}
