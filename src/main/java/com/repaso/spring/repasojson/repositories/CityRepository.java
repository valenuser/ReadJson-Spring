package com.repaso.spring.repasojson.repositories;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.repaso.spring.repasojson.interfaces.ICitiesRepository;
import com.repaso.spring.repasojson.models.City;

@Repository
public class CityRepository implements ICitiesRepository{

    public List<City> listCities;


    

    public CityRepository() {

        readCityJson();
    }

    private void readCityJson(){

        Resource resource = new ClassPathResource("json/cities.json");

        ObjectMapper objectMapper =  new ObjectMapper();

        try {
            listCities = Arrays.asList(objectMapper.readValue(resource.getFile(), City[].class));

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    @Override
    public List<City> allCities(){

        return listCities;

    }

    @Override
    public City cityByName(String name){

        return listCities.stream().filter(p -> p.getCiudad().equals(name)).findFirst().orElseThrow();

    }

}
