package com.techelevatorvehicle;

import java.math.BigDecimal;

public class Car implements Vehicle {
	public boolean isTrailer;
	public BigDecimal distanceTraveled = new BigDecimal("0.00");
	public BigDecimal toll = new BigDecimal("0");

	public Car(boolean isTrailer, BigDecimal distanceTraveled) {
		this.isTrailer = isTrailer;
		this.distanceTraveled = distanceTraveled;
		
	}

	@Override
	public BigDecimal calculateToll(int distance) {
		BigDecimal carToll = toll;
		BigDecimal zeroTwenty = new BigDecimal("0.020");
		if (isTrailer = true) {
			carToll = carToll.add(zeroTwenty.multiply(new BigDecimal(distance)));
			carToll = carToll.add(new BigDecimal("1.00"));
			return carToll;
			
		}
		carToll = carToll.add(zeroTwenty.multiply(new BigDecimal(distance)));
		return carToll;
	} 
	

}
