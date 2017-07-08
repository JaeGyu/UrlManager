package me.jaegyu.test.ex;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/*
 * @RunWith를 해줘야 된다. 
 * 매번 객체가 생성되고 테스트가 된다.
 * */
@RunWith(Parameterized.class)
public class ParameterizedTest {
	private String parameterName;
	private String parameterValue;
	
	/*
	 * 여러개를 생성하면 안되는지?
	 * */
	@Parameters
	public static Collection data(){
		/*
		 * 테스트할 파라미터를 아래처럼 코드로 fix시키는 것이 아니라 
		 * 외부에서 정의되서 읽어 온다든지 한다면 더 다이나믹한 테스트를 할 수 있게 된다.
		 * */
		return Arrays.asList(new Object[][]{
			{"p1","v1"},
			{"p2","v2"},
			{"p3","v3"},
			{"p4","v4"},
			{"p5","v5"},
			{"p6","v6"},
			{"p7","v7"}
		});
	}
	
	public ParameterizedTest(String parameterName, String parameterValue){
		System.out.println("Test case is started");
		this.parameterName = parameterName;
		this.parameterValue = parameterValue;
	}
	
	@Test
	public void printParameters() throws Exception {
		System.out.printf("Parameter Name: %s, Parameter Value: %s\n", this.parameterName, this.parameterValue);
		assertTrue(true);
	}
}
