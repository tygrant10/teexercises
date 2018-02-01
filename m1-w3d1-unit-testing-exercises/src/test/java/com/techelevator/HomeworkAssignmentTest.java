package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HomeworkAssignmentTest {

	private HomeworkAssignment homeWork;

	private int totalMarks;
	private int possibleMarks;

	@Before
	public void setUp() throws Exception {
		homeWork = new HomeworkAssignment(10);
	}

	@Test
	public void isLetterGradeCorrect() {
		possibleMarks = 100;
		totalMarks = 10;
		assertEquals("A", homeWork.getLetterGrade());
	}

	@Test
	public void whatIfTotalMarksIsOff() {
		possibleMarks = 5;
		totalMarks = 10;
		assertEquals("null" , homeWork.getLetterGrade());
	}
}
