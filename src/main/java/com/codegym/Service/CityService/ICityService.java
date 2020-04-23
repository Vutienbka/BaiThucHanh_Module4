package com.codegym.Service.CityService;

import com.codegym.Entity.City;

import java.util.List;

public interface ICityService {
    List<City> getAllCity();
    City addCity(City city);
    City findCityById(Long id);
    City updateCity(City city);
    void removeCity(City city);
}
