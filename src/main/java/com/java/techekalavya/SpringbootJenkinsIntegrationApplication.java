package com.java.techekalavya;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJenkinsIntegrationApplication {
	
	public static Logger logger = LoggerFactory.getLogger(SpringbootJenkinsIntegrationApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Spring init method");
	}

	public static void main(String[] args) {
		logger.info("Spring main class");
		SpringApplication.run(SpringbootJenkinsIntegrationApplication.class, args);
	}

}
