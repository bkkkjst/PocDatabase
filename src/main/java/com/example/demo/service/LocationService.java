package com.example.demo.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Location;
import com.example.demo.repo.LocationRepository;

@Service
public class LocationService {

	@Autowired
	private LocationRepository locationRepo;
	
	public Collection<Location> getAll() {
		Iterable<Location> iterator = locationRepo.findAll();
		
		Collection<Location> locations = new ArrayList<>();
		iterator.forEach(locations::add);
		
		return locations;
	}
	
	public void saveLocation(Location location) {
		locationRepo.save(location);
	}
}
