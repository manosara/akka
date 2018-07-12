package com.test.restservices.controller;

import java.util.Iterator;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.test.restservices.model.Employee;
import com.test.restservices.model.EmployeeDetails;
import com.test.restservices.repository.EmployeeRepository;
import com.test.restservices.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/employees")
	public  void addEmployee(@RequestBody Employee employee) throws Exception {
		Employee emp=employeeService.addEmployee(employee);
	
	}
	
	@GetMapping("/employees/{empId}")
	public List<EmployeeDetails> getEmployeeById(@PathVariable int empId) {
	 return employeeService.getEmployeeById(empId);
		
		
		
	}

}
