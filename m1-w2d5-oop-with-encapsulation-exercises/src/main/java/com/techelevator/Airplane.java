package com.techelevator;

public class Airplane {
	
	private String planeNumber;					//instance variables
	private int bookedFirstClassSeats;
	private int totalFirstClassSeats;
	private int bookedCoachSeats;
	private int totalCoachSeats;
	
	Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {  //constructor
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
		
	}
	
	public int getAvailableFirstClassSeats() {   //derived
		return bookedFirstClassSeats - totalFirstClassSeats;
		
	}
	
	public int getAvailableCoachSeats() {			//derived
		return bookedCoachSeats - totalCoachSeats;
		
	}
	
	 boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {  //method
		forFirstClass = true;
		 if (forFirstClass) {
			totalNumberOfSeats = getAvailableFirstClassSeats();
			if(totalNumberOfSeats > 0) {
				return true;
			}
			return false;
		}  
		 if (!forFirstClass) 
			totalNumberOfSeats = getAvailableCoachSeats();
			if(totalNumberOfSeats > 0) {
			 return true;
		 }
		 return false;
	 }

	public String getPlaneNumber() {				//getters and setters
		return planeNumber;
	}

	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}

	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}

	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}

	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}
}
