package me.jaegyu.url;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import me.jaegyu.url.mapper.TestMapper;

public class TestMapperTest extends UrlManagerApplicationTests{
	
	@Autowired
	private TestMapper mapper;
	
	@Test
	public void testFindAll() throws Exception {
		System.out.println(mapper.findAll());
		
	}
}
