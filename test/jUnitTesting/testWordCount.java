package jUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import testing.JUnitTesting;

public class testWordCount {
	@Test
	public
	void test() {
		JUnitTesting test = new JUnitTesting();
		int output = test.numOfLetters("Number");
		int expectedVal = 6;
		
		assertEquals(expectedVal, output);
	}	//	test
}	//	testWordCount
