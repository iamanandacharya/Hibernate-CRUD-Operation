package com.view;

// Generated 23 Nov, 2016 5:43:11 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Depa generated by hbm2java
 */
public class Depa implements java.io.Serializable {

	private Integer depaId;
	private String depName;
	private Set colleges = new HashSet(0);

	public Depa() {
	}

	public Depa(String depName, Set colleges) {
		this.depName = depName;
		this.colleges = colleges;
	}

	public Integer getDepaId() {
		return this.depaId;
	}

	public void setDepaId(Integer depaId) {
		this.depaId = depaId;
	}

	public String getDepName() {
		return this.depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public Set getColleges() {
		return this.colleges;
	}

	public void setColleges(Set colleges) {
		this.colleges = colleges;
	}

}