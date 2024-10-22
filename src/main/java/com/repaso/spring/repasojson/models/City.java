package com.repaso.spring.repasojson.models;

public class City {

    private String ciudad;
    private Integer habitantes;

    
    public City(String ciudad, Integer habitantes) {
        this.ciudad = ciudad;
        this.habitantes = habitantes;
    }

    public City() {

    }



    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(Integer habitantes) {
        this.habitantes = habitantes;
    }


}
