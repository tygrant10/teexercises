package com.techelevator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.techelevatorvehicle.Car;

public class CarTest {
	private Car civic;

	@Before
	public void setUp() throws Exception {
		civic = new Car(false, new BigDecimal ("40.00"));
	}

	@Test
	public void testSalaryWorker() {
		assertNotNull(civic);
	}
	@Test
	public void testGetDistanceTraveled() {
		assertEquals(new BigDecimal("40.00"), civic.distanceTraveled);
	}
	@Test
	public void testIsTrailer() {
		assertEquals(false, civic.isTrailer);
	}

}
