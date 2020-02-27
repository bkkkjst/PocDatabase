package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@GetMapping("/employee")
	public String greeting() {
		return "Hello";
	}
	
	@GetMapping("/employee/getPicture")
	public @ResponseBody byte[] getFirstPicture() {
		byte[] picture = employeeService.getAllPicture().iterator().next();
		return picture;
	}
}
