package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {

		int counter = 0;
		String line = "";
		String foundLine = "";
		String search = "";
		boolean isCaseSensitive = false;

		Scanner userInput = new Scanner(System.in);
		System.out.println("Which word would you like to find: ");
		search = userInput.nextLine();
		System.out.println("(true) or (false): You like to use a case-sensitive search. ");
		String answer = userInput.nextLine();
		if (answer.equals("true")) {
			isCaseSensitive = true;
		} else if (answer.equals("false")) {
			isCaseSensitive = false;
		}

		File alicesStory = new File("alices_adventures_in_wonderland.txt");
		try (Scanner lineReader = new Scanner(alicesStory)) {
			if (isCaseSensitive) {
				while (lineReader.hasNextLine()) {

					line = lineReader.nextLine();
					counter++;
					if (line.contains(search)) {
						foundLine = line;
						System.out.println(counter + ") " + foundLine);
					}
				}
				if (foundLine == "") {
					System.out.println("Document does not contain " + '"' + search + '"');
				}
			} else if (!isCaseSensitive) {
				while (lineReader.hasNextLine()) {
					line = lineReader.nextLine();
					String caseLine = line.toLowerCase();
					String caseSearch = search.toLowerCase();
					counter++;
					if (caseLine.contains(caseSearch)) {
						foundLine = line;
						System.out.println(counter + ") " + foundLine);
					}
				}
				if (foundLine == "") {
					System.out.println("Document does not contain " + '"' + search + '"');
				}
			}
		}
	}
}
