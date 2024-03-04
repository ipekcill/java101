package com.objectOrientedLesson;

import java.util.Arrays;
import java.util.List;

public class CityRun {
    public static void main(String[] args) {
        City city1 = new City("34", "Istanbul");
        City city2 = new City("35", "Izmir");
        List<City> cities = Arrays.asList(city1, city2);

        CityController cityController = new CityController(cities);
        System.out.println(cityController.getCities().toString());


    }
}
