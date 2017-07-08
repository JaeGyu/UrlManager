package me.jaegyu.test.ex;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	AnnotationFlow.class, // 같은 패키지 안에 있어서 풀네임으로 안썻다
	ParameterizedTest.class })
public class SuiteClasses {

	@BeforeClass
	public static void doBefore() {
		System.out.println("start");
	}

	@AfterClass
	public static void doAfter() {
		System.out.println("end");
	}
}
