package com.spring.learn.model;

public class Customer {
	private String firstName;
	private String lastName;

	//default no-arg constructor
	public Customer() {
		
	}
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
