package com.example.demo.repo;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Country;


public interface CountryRepository extends CrudRepository<Country, String>{
	
	List<Country> findByCountryName(@Param("name") String name);
	
	List<Country> findAllByCountryNameNotNull();

}
