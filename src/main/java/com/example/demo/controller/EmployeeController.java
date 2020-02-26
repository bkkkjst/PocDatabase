package com.example.demo.controller;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService mEmployeeService;

	@PatchMapping("/uploadPicture")
	public ResponseEntity<Object> uploadPictureById(@RequestParam("file") MultipartFile file, Long employeeId) {

		try {

			byte[] picture = file.getBytes();

			Employee employee = mEmployeeService.getEmployeeById(employeeId);
			if (employee != null) {
				employee.setPicture(picture);
				mEmployeeService.saveOrUpdate(employee);

				return new ResponseEntity<Object>("Employee is updated successsfully", HttpStatus.OK);
			} else {
				return new ResponseEntity<Object>("EmployeeID = " + employeeId + " not match", HttpStatus.BAD_REQUEST);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity<Object>("Employee error " + e.getMessage(), HttpStatus.BAD_REQUEST);
		}

	}
	
	@PatchMapping("/uploadClob")
	public ResponseEntity<Object> uploadClobById(@RequestParam("clob") String clob, Long employeeId){
		
		Employee employee = mEmployeeService.getEmployeeById(employeeId);
		if(employee != null) {
			employee.setClOb(clob);
			mEmployeeService.saveOrUpdate(employee);
			return new ResponseEntity<Object>("Employee is updated successsfully", HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>("EmployeeID = " + employeeId + " not match", HttpStatus.BAD_REQUEST);
		}

	}

}
