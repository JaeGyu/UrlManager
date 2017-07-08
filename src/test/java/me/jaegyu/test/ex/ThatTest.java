package me.jaegyu.test.ex;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import java.util.Arrays;

import org.hamcrest.core.CombinableMatcher;
import org.junit.Test;

public class ThatTest {
	@Test
	public void thatTest() throws Exception {
		String a = "Hello";
		assertThat(a, is(equalTo("Hello")));
	}

	@Test
	public void testAssertThathasItemsContainsString() throws Exception {
		assertThat(Arrays.asList(new String[] { "fun", "ban", "net" }), hasItems("fun", "ban"));
	}

	@Test
	public void testAssertThatEveryItemContainsString() throws Exception {
		assertThat(Arrays.asList(new String[] { "fun", "ban", "net" }), everyItem(containsString("n")));
	}

	@Test
	public void testAssertThatHamcrestCoreMatchers() throws Exception {
		assertThat("good", allOf(equalTo("good"), startsWith("good")));
		assertThat("good", not(allOf(equalTo("bad"), equalTo("good"))));
		assertThat("good", anyOf(equalTo("bad"), equalTo("good")));
		assertThat(7, not(CombinableMatcher.either(equalTo(3)).or(equalTo(4))));
		assertThat(7, not(anyOf(equalTo(3), equalTo(4))));
		assertThat(new Object(), not(sameInstance(new Object())));
	}

}
