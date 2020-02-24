package com.example.demo.repo;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Department;
import com.example.demo.model.Employee;

public interface DepartmentRepository extends CrudRepository<Department, Long> {
	
	// @Query("from Department d where d.departmentName = :departmentName")
	public Collection<Department> findByDepartmentNameIgnoreCaseContaining(String departmentName);

}
