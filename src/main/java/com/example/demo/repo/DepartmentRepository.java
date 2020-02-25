package com.example.demo.repo;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> {
	
	// @Query("from Department d where d.departmentName = :departmentName")
	public Collection<Department> findByDepartmentNameIgnoreCaseContaining(String departmentName);

}
