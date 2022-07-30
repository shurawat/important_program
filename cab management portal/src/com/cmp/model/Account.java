package com.cmp.model;

public class Account {
	
	
	
	public Account(String id, String firstName, String lastName, String aadharNumber, String mobileNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.aadharNumber = aadharNumber;
		this.mobileNumber = mobileNumber;
		this.password = "test";
	}
	
	
	private String id;
	private String firstName;
	private String lastName;
	private String aadharNumber;
	private String mobileNumber;
	private String password;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public boolean isAuthenticate(String password) {
		return this.password.equals(password);
	}

}
