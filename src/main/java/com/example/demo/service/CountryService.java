//package com.example.demo.service;
//
//import java.util.ArrayList;
//import java.util.Collection;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.dao.CountryRepo;
//import com.example.demo.model.Country;
//
//@Service
//public class CountryService {
//
//	@Autowired
//	private CountryRepo countryRepo;
//	
//	public Collection<Country> getAll() {
//		Iterable<Country> iterator = countryRepo.findAll();
//		
//		Collection<Country> countries = new ArrayList<>();
//		iterator.forEach(countries::add);
//		
//		return countries;
//	}
//}
