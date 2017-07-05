package me.jaegyu.url;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import me.jaegyu.url.model.UrlInfo;
import me.jaegyu.url.service.UrlManagerService;

public class UrlManagerTest extends UrlManagerApplicationTests {

	@Autowired
	private UrlManagerService service;

	@Test
	public void testSave() throws Exception {
		UrlInfo info = new UrlInfo("www.hadoop.net", "hadoop");
		System.out.println(service.createUrl(info));
	}

}
