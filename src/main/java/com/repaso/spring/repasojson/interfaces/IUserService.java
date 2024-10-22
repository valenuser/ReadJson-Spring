package com.repaso.spring.repasojson.interfaces;

import java.util.List;

import com.repaso.spring.repasojson.models.User;

public interface IUserService {

    List<User> allUsers();

    User userByName(String name);
    
} 
