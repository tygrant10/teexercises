package com.techelevator;

public class HomeworkAssignment {
	private int totalMarks;
	private int possibleMarks;
	private String submitterName;

	public String getLetterGrade() {
		if (totalMarks >= 90)
        {
        return "A";
        }
    if (totalMarks >= 80)
        {
        return "B";
        }
    if (totalMarks >= 70)
        {
        return "C";
        }
    if (totalMarks >= 60)
        {
        return "D";
        }
        return "F";
	}

	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
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
