package com.techelevatorvehicle;

import java.math.BigDecimal;


public class Main {
	
	public static void main(String[] args) {
		Car civic = new Car(false, new BigDecimal ("40.00"));
		Car crv = new Car(true, new BigDecimal ("20.00"));
		Truck toyota = new Truck(4, new BigDecimal ("10.00"));
		Truck ford = new Truck(6, new BigDecimal ("30.00"));
		Truck semi = new Truck(12, new BigDecimal ("50.00"));
		Tank army = new Tank(new BigDecimal ("500.00"));
		
		Vehicle[] listOfVehicles = {civic, crv, toyota, ford, semi, army};
		
		System.out.printf("%-15s%-26s%-22s\n","Vehicle","Distance Traveled","Toll $");
		System.out.println("-----------------------------------------------");
		
		for(Vehicle thisVehicle : listOfVehicles) {
			String thisCar = thisVehicle.getClass().getSimpleName();
			int distance = (int) (Math.random()*240+10);
			BigDecimal toll = thisVehicle.calculateToll(distance);
			System.out.printf("%-15s%-26s%-22s\n",thisCar,distance,toll);
		}

	}

}
