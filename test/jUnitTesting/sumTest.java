package jUnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;

import testing.JUnitTesting;

public class sumTest {
	@Test
	public
	void test() {
		/*
		 * Default
		 *	fail("Not yet implemented");
		 */
		JUnitTesting test = new JUnitTesting();	//	JUnit object
		int output = test.sum(5, 6);	//	output
		int expectedVal = 11;
		/*Equality check method for expectedValue matching the intended output*/
		assertEquals(expectedVal, output);
	}	//	test
}	//	sumTest
