package com.example.demo.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Employee;


public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	
	List<Employee> findByPicture(@Param("name") String name);

}

