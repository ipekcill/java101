package com.objectOrientedLesson;

import java.util.List;

public class CityController {
    private final List<City> cities;

    public CityController(List<City> cities) {
        this.cities = cities;

    }

    public List<City> getCities() {
        return cities;
    }

    public City getCityById(String id, List<City> cities) {
        for (City city : cities) {
            if (city.getId().equals(id)){
                return city;
            }
        }
        return null;
    }
}
