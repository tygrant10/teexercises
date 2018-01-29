package com.techelevator.dog;

public class Dog {

	private boolean sleeping = false;
	
	public void sleep() {
		this.sleeping = true;
	}
	public void wakeUp() {
		this.sleeping = false;
	}
	
	public String makeSound() {
		if (!sleeping) {
			return "Woof!";
		}
		return "Zzzzz...";
	}
	public boolean isSleeping() {
		return sleeping;
	}
}
