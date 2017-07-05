package me.jaegyu.url;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import me.jaegyu.url.mapper.UrlInfoMapper;

public class UrlInfoMapperTest extends UrlManagerApplicationTests{
	
	@Autowired
	private UrlInfoMapper mapper;
	
	@Test
	public void testFindAll() throws Exception {
		System.out.println(mapper.findAll());
	}

}
