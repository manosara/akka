package com.test.restservices.model;

public class EmployeeDetails {
	
	private String firstName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	private String lastName;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	private String deptName;

	public String getdeptName() {
		return deptName;
	}

	public void setdeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public EmployeeDetails()
	{
		
	}
	
	public EmployeeDetails(String firstName, String lastName, String deptName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.deptName = deptName;
	}
	
	@Override

	public String toString() {

		return "[firstName=" + firstName + ", lastName=" + lastName + ",deptName= "+deptName+"]";

	}
}
