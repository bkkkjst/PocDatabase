package com.example.demo.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Location;
import com.example.demo.service.LocationService;

@RestController
public class LocationController {
	
	@Autowired
	private LocationService locationService;
	
	
	@GetMapping("/location")
	public String greeting() {
		return "Hello";
	}
	
	@GetMapping("/location/getLocations")
	public Collection<Location> getLocations() {
		return locationService.getAll();
	}

	@PostMapping("/location/saveLocation")
	public void saveLocation(String streetAddr, String postalCode, String city, String stateProv) {
		Location location = new Location();
		location.setStreetAddress(streetAddr);
		location.setPostalCode(postalCode);
		location.setCity(city);
		location.setStateProvince(stateProv);
		
		locationService.saveLocation(location);
	}
}
