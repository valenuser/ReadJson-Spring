package com.repaso.spring.repasojson.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repaso.spring.repasojson.interfaces.ICitiesRepository;
import com.repaso.spring.repasojson.interfaces.ICityService;
import com.repaso.spring.repasojson.models.City;

@Service
public class CityService implements ICityService{

    @Autowired
    private ICitiesRepository citiesRepository;


    @Override
    public List<City> allCities(){

        return citiesRepository.allCities();

    }

    @Override
    public City cityByName(String name){

        return citiesRepository.cityByName(name);

    }

}
