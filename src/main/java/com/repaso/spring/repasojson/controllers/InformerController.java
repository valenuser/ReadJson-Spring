package com.repaso.spring.repasojson.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.repaso.spring.repasojson.interfaces.IInformerService;
import com.repaso.spring.repasojson.models.Informer;

@RestController
@RequestMapping("/all")
public class InformerController {

    @Autowired
    private IInformerService informerService;


    @GetMapping("/{city}")
    public Informer informerData(@PathVariable String city){

        return informerService.newInformer(city);

    }

}
