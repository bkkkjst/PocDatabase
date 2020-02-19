package com.example.demo.dao;


import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.Country;


public interface CountryRepository extends CrudRepository<Country, String>{

}
