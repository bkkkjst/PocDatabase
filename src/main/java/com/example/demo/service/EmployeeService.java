package com.example.demo.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepository;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeRepository mEmployeeRepository;

	public Employee saveOrUpdate(Employee employee) {
		return mEmployeeRepository.save(employee);
	}
	
	public void deleteById(Long employeeId) {
		mEmployeeRepository.deleteById(employeeId);
	}

	public Employee getEmployeeById(Long employeeId) {
		Optional<Employee> employee = mEmployeeRepository.findById(employeeId);
		return employee.isPresent() ? employee.get() : null;
	}
}
