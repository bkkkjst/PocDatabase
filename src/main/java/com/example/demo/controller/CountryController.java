//package com.example.demo.controller;
//
//import java.util.Collection;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.querydsl.binding.QuerydslPredicate;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.dao.CountryRepository;
//import com.example.demo.model.Country;
//import com.example.demo.service.CountryService;
//
////@RestController
//public class CountryController {
//	
//	@Autowired
//	private CountryService mService;
//	
//	@Autowired
//	private CountryRepository mCountryRepo;
//	
//	
//	@GetMapping("/")
//	public String greeting() {
//		return "Hello";
//	}
//	
//	@GetMapping("/getCountries")
//	public Collection<Country> getCountries() {
//		return mService.getAll();
//	}
//
//}

/////////////////////////////////////////////////////////
