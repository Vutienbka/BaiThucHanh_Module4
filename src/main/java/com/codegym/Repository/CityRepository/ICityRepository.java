package com.codegym.Repository.CityRepository;

import com.codegym.Entity.City;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICityRepository extends PagingAndSortingRepository<City,Long> {
}
