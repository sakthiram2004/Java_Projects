package com.example.Registation.controller;

import com.example.Registation.model.MyUser;
import com.example.Registation.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/myuser")
    MyUser newUser(@RequestBody MyUser newUser){
        return  userRepository.save(newUser);
    }


    @GetMapping(path = "/allmyuser")
    List<MyUser> getAllUsers(){
        return userRepository.findAll();
    }

}
