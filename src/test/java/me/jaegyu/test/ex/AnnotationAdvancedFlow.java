package me.jaegyu.test.ex;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.JUnitCore;

public class AnnotationAdvancedFlow {

	@BeforeClass
	public static void doBefore() {
		System.out.println("starting test...");
	}

	@Before
	public void init() {
		System.out.println("Init...");
	}

	@Test
	public void calc1() throws Exception {
		System.out.println("11111");
		assertTrue(true);
	}

	@Test
	public void runTesstCase() throws Exception {
		JUnitCore j = new JUnitCore();
		j.run(AnnotationFlow.class);
	}

	@Test
	public void calc2() throws Exception {
		System.out.println("22222");
		assertTrue(true);
	}

	@After
	public void finalize() {
		System.out.println("Final....");
	}

	@AfterClass
	public static void doAfter() {
		System.out.println("Shutdown...");
	}
}
