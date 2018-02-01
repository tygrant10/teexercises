package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	
	private Employee name;
	private int employeeId;
    private String firstName;
    private String lastName;
    private String department;
    private double annualSalary;

	@Before
	public void setUp() throws Exception {
		name = new Employee( 5050, "gary", "smith", 10000.00);
	}

	@Test
	public void doesItAddRaises() {
		annualSalary = 10000.00;
		double raiseAmount = annualSalary * .10/100;
        annualSalary += raiseAmount;
        assertEquals(1100.00, name.getAnnualSalary(),annualSalary);
	}

}
