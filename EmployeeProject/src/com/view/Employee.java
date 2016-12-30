package com.view;

// Generated Dec 24, 2016 12:07:02 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Employee generated by hbm2java
 */
public class Employee implements java.io.Serializable {

	private Integer empId;
	private String firstName;
	private String lastName;
	private String address;
	private Integer phone;
	private String gender;
	private String role;
	private Date dateOfBirth;

	public Employee() {
	}

	public Employee(String firstName, String lastName, String address,
			Integer phone, String gender, String role, Date dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.gender = gender;
		this.role = role;
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getEmpId() {
		return this.empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPhone() {
		return this.phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}