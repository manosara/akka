package com.test.restservices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int deptId;
		
		@Column(name="Dept_Name")
		private String deptName;
		
		@Column(name="empId")
		private int empId;
		
		public String getDeptName() {
			return deptName;
		}
		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		
		public int getDeptId() {
			return deptId;
		}
		public void setDeptId(int deptId) {
			this.deptId = deptId;
		}
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public Department() {
			
		}
		public Department(int deptId, String deptName, int empId) {
			super();

			this.deptId = deptId;
			this.deptName= deptName;
			this.empId = empId;
		}
		
	
}

