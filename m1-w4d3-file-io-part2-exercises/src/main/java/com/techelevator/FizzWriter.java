package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {
		
		String number = "0";
		int fizzBuzzLimit;
		
		while(true) {
		System.out.println("Please choose a number for FizzBuzz between 1 - 300 (inclusive)");
		Scanner userInput = new Scanner(System.in);
		fizzBuzzLimit = Integer.parseInt(userInput.nextLine());
		
		if(fizzBuzzLimit > 0 && fizzBuzzLimit <= 300) {
	
		break;
		}
		else {
			continue;
		}
		}	
		
		File newFile = new File("/Users/tylergrant/Desktop/FizzBuzz.txt");
		
		try {
			newFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		fizzBuzz(fizzBuzzLimit, newFile); 
	}

		private static void fizzBuzz (int inputNumber, File newFile) {
			try (PrintWriter writer = new PrintWriter(newFile)) {
			for(int i = 1; i <= inputNumber; i++) {
			String number;
			String inputAsString = Integer.toString(i);
			if ((i % 3 == 0 && i % 5 == 0) || (inputAsString.contains("3") && inputAsString.contains("5"))) {
				number = "FizzBuzz";
				writer.println(number);
			} else if ((i % 3 == 0) || inputAsString.contains("3")) {
				number = "Fizz";
				writer.println(number);
			} else if ((i % 5 == 0) || inputAsString.contains("5")) {
				number = "Buzz";
				writer.println(number);
			} else {
				number = Integer.toString(i);
				writer.println(number);
			}
			
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("Please check your desktop for the file");	
		}

}
		
	