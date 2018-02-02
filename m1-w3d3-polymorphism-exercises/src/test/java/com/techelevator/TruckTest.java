package com.techelevator;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.techelevatorvehicle.Truck;

public class TruckTest {

		private Truck toyota;
		

		@Before
		public void setUp() throws Exception {
			toyota = new Truck(4, new BigDecimal ("10.00"));
		}

		@Test
		public void testSalaryWorker() {
			assertNotNull(toyota);
		}
		@Test
		public void testGetDistanceTraveled() {
			assertEquals(new BigDecimal("10.00"), toyota.distanceTraveled);
		}
		@Test
		public void testIsTrailer() {
			assertEquals(4, toyota.axel );
		}

	}
