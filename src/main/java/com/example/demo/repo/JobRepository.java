package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Job;

public interface JobRepository extends CrudRepository<Job, String>{

}
