package com.techelevator;

public class Employee {	
	private int employeeId;			//instance variables
	private String firstName;
	private String lastName;
	private String department;
	private double annualSalary;
	
	
	public Employee(int employeeId, String firstName, String lastName, double salary) { //constructor
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.annualSalary = salary;
		
	}
	
	public String getFullName() {   //derived
		return lastName + ", " + firstName;
	}
	
	public void raiseSalary(double percent) {    //method 
		annualSalary = (annualSalary/100) * percent + annualSalary;
		
	}
	
	public String getLastName() {		//getters and setters
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}

	
	
	

	
	
	
	
	
	
}
