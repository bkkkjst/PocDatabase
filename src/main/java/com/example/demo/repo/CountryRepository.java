package com.example.demo.repo;

import java.util.List;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Country;


public interface CountryRepository extends CrudRepository<Country, String>{
	
	List<Country> findByCountryName(@Param("name") String name);
	
	List<Country> findAllByCountryNameNotNull();


}
