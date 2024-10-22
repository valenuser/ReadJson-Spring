package com.repaso.spring.repasojson.repositories;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;


import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.repaso.spring.repasojson.interfaces.IUserRepository;
import com.repaso.spring.repasojson.models.User;


@Repository
public class UserRepository implements IUserRepository{



    private List<User> listUsers;

    public UserRepository(){

        readUserJson();
    }


    private void readUserJson( ){

        Resource resource = new ClassPathResource("json/users.json");

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            listUsers = Arrays.asList(objectMapper.readValue(resource.getFile(), User[].class));

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    @Override
    public List<User> allUsers(){

        return listUsers;
    }

    public User userByName(String name){

        return listUsers.stream().filter(p -> p.getNombre().equals(name)).findFirst().orElseThrow();

    }

}
