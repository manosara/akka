package com.test.restservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.restservices.model.Employee;
import com.test.restservices.model.EmployeeDetails;
import com.test.restservices.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository empRepo;
	
	public Employee addEmployee(Employee emp) {
		Employee employee =empRepo.save(emp);
		return employee;
	}
	
	public List<EmployeeDetails> getEmployeeById(int empId) {
		return empRepo.findEmployeeNameandDeptNameById(empId);	
	}

}
