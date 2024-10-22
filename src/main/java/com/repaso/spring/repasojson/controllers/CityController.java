package com.repaso.spring.repasojson.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.repaso.spring.repasojson.interfaces.ICityService;
import com.repaso.spring.repasojson.models.City;

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private ICityService cityService;

    @GetMapping
    public List<City> allCities(){

        return cityService.allCities();

    }


    @GetMapping("/{name}")
    public City cityByName(@PathVariable String name){

        return cityService.cityByName(name);

    }

}
