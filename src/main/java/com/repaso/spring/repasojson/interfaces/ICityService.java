package com.repaso.spring.repasojson.interfaces;

import java.util.List;

import com.repaso.spring.repasojson.models.City;

public interface ICityService {

    List<City> allCities();

    City cityByName(String name);
    
} 
