package com.example.demo.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Job;

public interface JobRepository extends CrudRepository<Job, String>{
	
	List<Job> findByJobTitle(@Param("title") String name);

}
