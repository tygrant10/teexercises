package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSplitter {

	public static void main(String[] args) {
		//File originalFile = new File("/Users/tylergrant/Desktop/FizzBuzz.txt");
		File originalFile = new File("alices_adventures_in_wonderland.txt");
		
		int counter = 0;

			try (Scanner lineReader = new Scanner(originalFile)) {
				
					while (lineReader.hasNextLine()) {
						
						counter++;
						File newFile = new File("/Users/tylergrant/Desktop/piece" + Integer.toString(counter));
						newFile.createNewFile();
						try (PrintWriter writer = new PrintWriter(newFile)) {
							System.out.println(counter);
						
					for(int i = 0; i < 100; i++) {
						if(lineReader.hasNextLine()) {
						String line = lineReader.nextLine();
						writer.println(line);
						}
					}
					
					}
					}

	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

			}
	}
