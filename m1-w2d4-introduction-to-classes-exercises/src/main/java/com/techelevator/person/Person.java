package com.techelevator.person;

public class Person {

	private String firstName;  					//1.  instance variables, start with these
	private String lastName;
	private int age;
	
	 public String getFullName() {				//3. get your methods
		 return lastName + ", " + firstName;
	 }
	 
	 public boolean isAdult() {					//3. method
		 return (age >= 18);						//saying if age is 18 or more return true
	 }
	
	public String getFirstName() {  				//2.  then get your getters and setters
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
