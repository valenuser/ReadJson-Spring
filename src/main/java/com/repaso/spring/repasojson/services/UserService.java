package com.repaso.spring.repasojson.services;

import java.util.List;
import com.repaso.spring.repasojson.models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repaso.spring.repasojson.interfaces.IUserRepository;
import com.repaso.spring.repasojson.interfaces.IUserService;

@Service
public class UserService implements IUserService{

    @Autowired
    private IUserRepository repository;

    public List<User> allUsers(){

        return repository.allUsers();

    }

    public User userByName(String name){

        return repository.userByName(name);

    }

}
