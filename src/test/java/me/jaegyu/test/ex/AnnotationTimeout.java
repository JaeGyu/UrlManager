package me.jaegyu.test.ex;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnnotationTimeout {
	
	/*
	 * 5초 이내에 테스트가 끝나지 않는다면 에러로 간주 하겠다. 
	 * */
	@Test(timeout = 5000)
	public void timeTest() throws Exception {
		Thread.sleep(10000);
		assertTrue(true);
	}
}
