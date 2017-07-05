package me.jaegyu.url;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.UUID;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import me.jaegyu.url.model.UrlInfo;
import me.jaegyu.url.model.UrlInfoDto;
import me.jaegyu.url.service.UrlManagerService;

public class UrlManagerTest extends UrlManagerApplicationTests {

	@Autowired
	private UrlManagerService service;

	@Test
	public void testSave() throws Exception {
		UrlInfoDto.Create create = new UrlInfoDto.Create();
		String uuid = UUID.randomUUID().toString().replace("-", "");
		create.setUrl("www.randomUrl.com/" + uuid);
		create.setDesc(uuid);
		System.out.println(service.createUrl(create));
	}

}
