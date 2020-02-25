package com.example.demo.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.Department;
import com.example.demo.model.Employee;
import com.example.demo.model.Job;


public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	
}

