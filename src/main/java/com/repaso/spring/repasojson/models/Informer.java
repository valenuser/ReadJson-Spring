package com.repaso.spring.repasojson.models;

import java.util.List;


public class Informer {
    
    private City city;
    private List<User> users;
    
    public Informer(City city, List<User> users) {
        this.city = city;
        this.users = users;
    }

    public City getCity() {

        return city;

    }
    
    public void setCity(City city) {

        this.city = city;
    }

    public List<User> getUsers() {
        
        return users;

    }

    public void setUsers(User user) {

        this.users.add(user);

    }

    


}
