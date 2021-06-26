package com.java.techekalavya;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootJenkinsIntegrationApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(SpringbootJenkinsIntegrationApplication.class);

	@Test
	void contextLoads() {
		logger.info("Spring Test class");
		assertEquals(true, true);
	}

}
