package com.techelevator;

public class HomeworkAssignment {
	
	private int totalMarks;
	private int possibleMarks;
	private String submitterName;
	
	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}
	
	public String getLetterGrade() {
		double percentage = (double)totalMarks / possibleMarks;
		if(percentage >= .9) {
			return "A";
		} else if (percentage >= .8) {
			return "B";
		} else if (percentage >= .7) {
			return "C";
		} else if (percentage >= .6) {
			return "D";
		} else {
			return "F";
		}
	}
	
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public String getSubmitterName() {
		return submitterName;
	}
	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}
	public int getPossibleMarks() {
		return possibleMarks;
	}
	
}
