package com.techelevatorvehicle;

import java.math.BigDecimal;

public class Truck implements Vehicle {
	public BigDecimal distanceTraveled = new BigDecimal("0.00");
	public BigDecimal toll = new BigDecimal("0");
	public int axel;

	public Truck(int axel, BigDecimal distanceTraveled) {
		this.axel = axel;
		this.distanceTraveled = distanceTraveled;

	}

	@Override
	public BigDecimal calculateToll(int distance) {
		BigDecimal truckToll = toll;
		BigDecimal perMile = new BigDecimal("0.00");
		if (axel == 4) {
			perMile = new BigDecimal("0.040");
			truckToll = truckToll.add(perMile.multiply(new BigDecimal(distance)));
			return truckToll;
		}
		if (axel == 6) {
			perMile = new BigDecimal("0.045");
			truckToll = truckToll.add(perMile.multiply(new BigDecimal(distance)));
			return truckToll;
		}
		if (axel >= 8) {
			perMile = new BigDecimal("0.048");
			truckToll = truckToll.add(perMile.multiply(new BigDecimal(distance)));
			return truckToll;

		}
		return truckToll;
	}
}