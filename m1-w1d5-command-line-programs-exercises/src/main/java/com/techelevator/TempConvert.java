package com.techelevator;

import java.util.Scanner;

/*
 The Fahrenheit to Celsius conversion formula is:
 	Tc = (Tf - 32) / 1.8
 	where 'Tc' is the temperature in Celsius, and 'Tf' is the temperature in Fahrenheit
 	
 The Celsius to Fahrenheit conversion formula is:
 	Tf = Tc * 1.8 + 32
 	
 Write a command line program which prompts a user to enter a temperature, and whether its in degrees (C)elsius or (F)arenheit.
 Convert the temperature to the opposite degrees, and display the old and new temperatures to the console.
  
 $ java TempConvert
 Please enter the temperature: 58
 Is the temperature in (C)elcius, or (F)arenheit? F
 58F is 14C.
 
 Note why Tf - 32 above is enclosed in parentheses with a comment inside your code. You'll feel better for it, 
 and will start building some good programming habits while you're at it.
 */
public class TempConvert {

	public static void main(String[] args) {
		//Setup
		Scanner input = new Scanner(System.in);
		
		//User interaction (UI)
		System.out.print("Please enter temperature: ");
		String tempAsString = input.nextLine();
		
		System.out.print("Is the temperature in (C)elcius, or (F)arenheit? ");
		String tempTypeAsString = input.nextLine();
		
		//Parse
		double temp = Double.parseDouble(tempAsString);
		char tempType = tempTypeAsString.charAt(0);
		
		//Calculations
		double result;
		char resultType;
		if(tempType == 'c' || tempType == 'C') {
			result = (temp *1.8) + 32;
			resultType = 'F';
		} else {
			result = (temp - 32) / 1.8;
			resultType = 'C';
		}
		
		System.out.println("" + temp + tempType + " is " + result + resultType);
		
	}

}
