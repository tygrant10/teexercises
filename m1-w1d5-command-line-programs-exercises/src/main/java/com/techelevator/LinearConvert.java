package com.techelevator;

import java.util.Scanner;

/*
 The foot to meter conversion formula is:
 	m = f * 0.3048
 	
 The meter to foot conversion formula is:
 	f = m * 3.2808399
 	
 Write a command line program which prompts a user to enter a length, and whether the measurement is in (m)eters or (f)eet.
 Convert the length to the opposite measurement, and display the old and new measurements to the console.
  
 $ java LinearConvert
 Please enter the length: 58
 Is the measurement in (m)eter, or (f)eet? f
 58f is 17m.
 */

public class LinearConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the length: ");
		String lengthAsString = input.nextLine();
		
		System.out.print("Is the measurement in (m)eter, or (f)eet? ");
		String lengthTypeAsString = input.nextLine();
		
		double length = Double.parseDouble(lengthAsString);
		char lengthType = lengthTypeAsString.charAt(0);
		
		double result;
		char resultType;
		if(lengthType == 'm' || lengthType == 'M') {
			result = (length * 3.2808399);
			resultType = 'f';
		} else {
			result = (length * 0.3048);
			resultType = 'm';
		
		}
		
		System.out.printf("%.0f%c" , length, lengthType);
		System.out.printf(" is %d%c" , (int)result , resultType);
	}

}
