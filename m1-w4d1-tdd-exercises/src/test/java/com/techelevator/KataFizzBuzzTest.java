package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {

	@Test
	public void testIsOneReturningOne() {
		assertEquals("1", KataFizzBuzz.fizzBuzz(1));

	}

	@Test
	public void testIsTwoReturningTwo() {
		assertEquals("2", KataFizzBuzz.fizzBuzz(2));
	}

	@Test
	public void testIsThreeReturningFizz() {
		assertEquals("Fizz", KataFizzBuzz.fizzBuzz(3));
	}

	@Test
	public void testIsFiveReturningBuzz() {
		assertEquals("Buzz", KataFizzBuzz.fizzBuzz(5));
	}

	@Test
	public void testIsFifteenReturningFizzBuzz() {
		assertEquals("FizzBuzz", KataFizzBuzz.fizzBuzz(15));
	}

	@Test
	public void testJustTheNumberThree() {
		assertEquals("FizzBuzz", KataFizzBuzz.fizzBuzz(135));
	}

	@Test
	public void testJustTheNumberTwentyThree() {
		assertEquals("Fizz", KataFizzBuzz.fizzBuzz(23));
	}

	@Test
	public void testJustTheNumberTwentyFive() {
		assertEquals("Buzz", KataFizzBuzz.fizzBuzz(25));
	}
}