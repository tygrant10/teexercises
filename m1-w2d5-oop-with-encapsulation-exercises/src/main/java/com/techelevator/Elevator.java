package com.techelevator;

public class Elevator {
	private int currentFloor = 1;
	private int numberOfFloors;
	private boolean doorOpen;

	Elevator(int totalNumberOffloors) {
		this.numberOfFloors = totalNumberOffloors;
	}

	void openDoor() {
		doorOpen = true;
	}

	void closeDoor() {
		doorOpen = false;
	}

	public void goUp(int desiredFloor) {
		if (!doorOpen) {
			if (getNumberOfFloors() >= desiredFloor)
				currentFloor += desiredFloor;
		}
		currentFloor = getCurrentFloor();
	}

	public void goDown(int desiredFloor) {
		if (!doorOpen) {
			if (desiredFloor >= 1) {
				currentFloor -= desiredFloor;
			}
		}
		currentFloor = getCurrentFloor();
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public boolean isDoorOpen() {
		return doorOpen;
	}

}
