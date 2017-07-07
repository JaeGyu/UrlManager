package me.jaegyu.test.ex;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AnnotationFlow {

	@Before
	public void setUp() throws Exception {
		System.out.println("Init...");
	}

	@Test
	public void claculateFirst() throws Exception {
		System.out.println("Canculate First");
		assertTrue(true);
	}

	@Test
	public void claculateSecond() throws Exception {
		System.out.println("Canculate Second");
		assertTrue(true);
	}

	@After
	public void dropDown() {
		System.out.println("Final....");
	}
}
