package com.devus.highfood.modules.users.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devus.highfood.modules.users.model.UserEntity;
import com.devus.highfood.modules.users.repository.UserRepository;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity create(UserEntity userEntity) {
        var userPayload = userRepository.save(userEntity);
        return userPayload;
    }

    public List<UserEntity> getAll(){
        
        List<UserEntity> listaUsers =  getListFromIterator(userRepository.findAll().iterator());
        return listaUsers;
    }

    public static List<UserEntity> getListFromIterator(Iterator<UserEntity> iterator) {

        List<UserEntity> actualList = new ArrayList<UserEntity>();
        while (iterator.hasNext()) {
            actualList.add(iterator.next());
        }
        return actualList;
    }

}
