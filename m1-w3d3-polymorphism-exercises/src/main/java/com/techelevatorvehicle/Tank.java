package com.techelevatorvehicle;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Tank implements Vehicle {
	
	public BigDecimal toll = new BigDecimal("0");
	public BigDecimal distanceTraveled = new BigDecimal("0.00");
	
	
	public Tank(BigDecimal distanceTraveled) {
		this.distanceTraveled = distanceTraveled;
	}

	@Override
	public BigDecimal calculateToll(int distance) {
		BigDecimal tankToll = new BigDecimal("0");
		return tankToll;
	}

}
