package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSplitter {

	public static void main(String[] args) {
		File originalFile = new File("/Users/tylergrant/Desktop/FizzBuzz.txt");
		

			try (Scanner lineReader = new Scanner(originalFile)) {
				
					while (lineReader.hasNextLine()) {
						int counter = 1;
						File newFile = new File("/Users/tylergrant/Desktop/piece" + Integer.toString(counter));
						PrintWriter writer = new PrintWriter(newFile);
					
						
					for(int i = 0; i < 100; i++) {
						String line = lineReader.nextLine();
						writer.println(line);
					
					}
					}

	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

			}
	}
