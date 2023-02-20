package com.devus.highfood.modules.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.devus.highfood.modules.users.model.Role;
import com.devus.highfood.modules.users.model.UserEntity;
import com.devus.highfood.modules.users.services.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public @ResponseBody List<UserEntity> getUsers(){
        return userService.getAll();
    }

    @PostMapping("/user/register")
    public UserEntity register(@RequestBody UserEntity userEntity){
        userEntity.setRole(Role.USER);
       var userPayload =  userService.create(userEntity);
      return userPayload;  
    }

    @PostMapping("/admin/register")
    public UserEntity registerAdmin(@RequestBody UserEntity userEntity){
        userEntity.setRole(Role.ADMIN);
       var userPayload =  userService.create(userEntity);
      return userPayload;  
    }


    
}
