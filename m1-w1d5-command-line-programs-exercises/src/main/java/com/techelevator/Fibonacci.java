package com.techelevator;

import java.util.Scanner;

/*
 The Fibonacci numbers are the integers in the following sequence:  
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 
Write a command line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number.

  
 $ java Fiboncci
 
Please enter the Fibonacci number: 25
 
 0, 1, 1, 2, 3, 5, 8, 13, 21
 */
public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the Fibonacci number: ");
		String fibString = input.nextLine();
		
		int fib = Integer.parseInt(fibonacci);
		
		int a = 0;
		int b = 1;
		int c = 0;
		
		if (fib != 0 ) {
			for (int i = 0; i <= fib; i += 0) {
				System.out.print(a + " ");
				c = b + a;
				a=b;
				b=c;
				i=c;
			}
		}else {System.out.print("0 is the first number in the Fibanacci sequence");
		
			}
		}
	
	}


