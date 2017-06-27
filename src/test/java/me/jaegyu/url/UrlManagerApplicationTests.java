package me.jaegyu.url;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = UrlManagerApplication.class)
@SpringBootTest(classes = UrlManagerApplication.class)
public class UrlManagerApplicationTests {

	
	@Autowired
	private DataSource ds;

	@Autowired
	private SqlSessionFactory sessionFactory;
	
	
	@Test
	public void contextLoads() {
	}

}
