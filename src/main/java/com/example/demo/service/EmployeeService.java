package com.example.demo.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepo;
	
	public Collection<Employee> getAll() {
		Iterable<Employee> iterator = employeeRepo.findAll();
		
		Collection<Employee> employees = new ArrayList<>();
		iterator.forEach(employees::add);
		
		return employees;
	}
	
	public Collection<byte[]> getAllPicture() {
		Collection<byte[]> pictures = new ArrayList<>();
		Iterable<Employee> iterator = employeeRepo.findAll();
		
		while(iterator.iterator().hasNext()) {
			Employee employee = iterator.iterator().next();
			pictures.add(employee.getPicture());
		}
		
		return pictures;
	}
}
