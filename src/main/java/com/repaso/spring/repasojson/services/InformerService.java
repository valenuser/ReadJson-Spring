package com.repaso.spring.repasojson.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.repaso.spring.repasojson.models.City;
import com.repaso.spring.repasojson.interfaces.ICitiesRepository;
import com.repaso.spring.repasojson.interfaces.IInformerService;
import com.repaso.spring.repasojson.interfaces.IUserRepository;
import com.repaso.spring.repasojson.models.Informer;
import com.repaso.spring.repasojson.models.User;
import com.repaso.spring.repasojson.repositories.InformerRepository;

@Service
public class InformerService implements IInformerService{

    @Autowired
    private InformerRepository informerRepository;
    
    @Autowired
    private IUserRepository userRepository;
    
    @Autowired
    private ICitiesRepository citiesRepository;



    @Override
    public Informer newInformer(String city){

        List<City> cities = citiesRepository.allCities();
        List<User> users =  userRepository.allUsers();


        City cityData = cities.stream().filter(p -> p.getCiudad().equals(city)).findFirst().orElseThrow();
        List<User> userList = users.stream().filter(p -> p.getCiudad().equals(city)).toList();


        return informerRepository.newInformer(cityData, userList);


    }

}
