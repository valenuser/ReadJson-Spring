package com.repaso.spring.repasojson.controllers;

import java.util.List;
import com.repaso.spring.repasojson.models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.repaso.spring.repasojson.interfaces.IUserService;

@RestController
@RequestMapping("/users")
public class UserController {


    @Autowired
    private IUserService service;

    @GetMapping
    public List<User> allUsers(){

        return service.allUsers();

    }

    @GetMapping("/{name}")
    public User userByName(@PathVariable String name){

     return service.userByName(name);   

    }

}
