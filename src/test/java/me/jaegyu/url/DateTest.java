package me.jaegyu.url;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.junit.Test;

public class DateTest {
	
	@Test
	public void testDateToString() throws Exception {
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		DateTimeFormatter formmter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(formmter.format(ldt));
	}

}
