package com.test.restservices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.restservices.model.Employee;
import com.test.restservices.model.EmployeeDetails;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@SuppressWarnings("unchecked")
	public Employee save(Employee employee);
	
	@Query("select e.firstName,e.lastName,d.deptName from Employee e, Department d where e.id=d.empId and e.id= :empId")
	public List<EmployeeDetails> findEmployeeNameandDeptNameById(@Param("empId") int empId);
}

