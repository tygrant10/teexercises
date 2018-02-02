package com.techelevator;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.techelevatorvehicle.Tank;


public class TankTest {
	
	private Tank army;

	@Before
	public void setUp() throws Exception {
		army = new Tank(new BigDecimal ("500.00"));
	}

	@Test
	public void testSalaryWorker() {
		assertNotNull(army);
	}
	@Test
	public void testGetDistanceTraveled() {
		assertEquals(new BigDecimal("500.00"), army.distanceTraveled);
	}
	

}
