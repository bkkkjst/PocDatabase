package com.example.demo.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Country;
import com.example.demo.model.Region;

public interface RegionRepository extends CrudRepository<Region, Long>{
	
	List<Region> findByRegionName(@Param("name") String name);

}
