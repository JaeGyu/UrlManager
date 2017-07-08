package me.jaegyu.test.ex;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ SuiteClasses.class })
public class SuiteToSuite {

	@BeforeClass
	public static void before() {
		System.out.println("처음~~~~~~~~~~~~~~");
	}

	@AfterClass
	public static void after() {
		System.out.println("마지막~~~~~~~~~~~~");
	}
}
