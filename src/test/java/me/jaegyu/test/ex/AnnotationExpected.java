package me.jaegyu.test.ex;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnnotationExpected {

	@Test(expected = java.lang.ArithmeticException.class)
	public void testCalc() throws Exception {
		System.out.println(4/0);
		assertTrue(true);
	}
}
