package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long>{

}
