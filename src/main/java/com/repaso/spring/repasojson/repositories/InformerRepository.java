package com.repaso.spring.repasojson.repositories;


import java.util.List;


import org.springframework.stereotype.Repository;


import com.repaso.spring.repasojson.interfaces.IInformer;

import com.repaso.spring.repasojson.models.City;
import com.repaso.spring.repasojson.models.Informer;
import com.repaso.spring.repasojson.models.User;

@Repository
public class InformerRepository implements IInformer{



    @Override
    public Informer newInformer(City city, List<User> users){

        return new Informer(city,users);

    }

}
