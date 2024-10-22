package com.repaso.spring.repasojson.interfaces;

import java.util.List;

import com.repaso.spring.repasojson.models.City;
import com.repaso.spring.repasojson.models.Informer;
import com.repaso.spring.repasojson.models.User;

public interface IInformer {

    Informer newInformer(City city, List<User> users);

    
}
