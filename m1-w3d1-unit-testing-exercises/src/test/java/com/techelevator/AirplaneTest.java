package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AirplaneTest {
	
	private String planeNumber;
    private int totalFirstClassSeats;
    private int bookedFirstClassSeats = 0;
    private int totalCoachSeats;
    private int bookedCoachSeats = 0;

	private Airplane plane;
	public boolean Reserve(boolean firstClass, int totalNumberOfSeats) {
		return firstClass = true;
	}

	@Before
	public void setUp() throws Exception {
		plane = new Airplane(20, 30);
		
	}

	@Test
	public void getTotalFirstClassSeats() {
		assertEquals(20, plane.getTotalFirstClassSeats());
		
	}
	
	@Test
	public void canWeOverBook() {
		bookedFirstClassSeats = 20;
		assertEquals(0, plane.getAvailableFirstClassSeats());
		
	
	}
	@Test
	public void ifBuyTicketIsCountAccurate() {
		totalFirstClassSeats = 15;
		bookedFirstClassSeats = 2;
		assertEquals(13, plane.getAvailableFirstClassSeats());
		
		
		
		
	
	}
}
