package com.test.restservices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		
		@Column(name="First_Name")
		private String firstName;
		public String getFirstName() {
			return firstName;
		}
		@Column(name="Last_Name")
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		private String lastName;

		public Employee() {

		}

		public Employee(int id, String firstName, String lastName) {

			super();

			this.id = id;

			this.firstName = firstName;

			this.lastName = lastName;

		}

		public int getId() {

			return id;

		}

		public void setId(int id) {

			this.id = id;

		}

		@Override

		public String toString() {

			return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";

		}
	
}

