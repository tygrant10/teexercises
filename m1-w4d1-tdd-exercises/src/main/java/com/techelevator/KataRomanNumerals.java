package com.techelevator;

public class KataRomanNumerals {
	
	private static int number;

	public static String convertToRomanNumerals(int input) {
		number = input;
		String result = "";
		
		//creates our long form roman numeral
		result += convertNumberToRoman(50, "L");
		result += convertNumberToRoman(10, "X");
		result += convertNumberToRoman(5, "V");
		result += convertNumberToRoman(1, "I");
		
		//make short form 
		result = translateLongFormToShortForm(result, "VIIII", "IX");
		result = translateLongFormToShortForm(result, "IIII", "IV");
		
		
		return result;
	}
	
	private static String translateLongFormToShortForm(String romanNumerals, String longForm, String shortForm) {
		return romanNumerals.replace(longForm, shortForm);
	}

	private static String convertNumberToRoman(int takeaway, String replacementRoman) {
		String result = "";
		while(number >= takeaway) {
			number -= takeaway;
			result += replacementRoman;
		}
		return result;
	}
	
	
	
}
