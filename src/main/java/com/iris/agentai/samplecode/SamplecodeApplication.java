package com.iris.agentai.samplecode;

import org.apache.logging.log4j.spi.LoggerContextFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SamplecodeApplication {

	private static final Logger logger = LoggerFactory.getLogger(SamplecodeApplication.class);

	public static void main(String[] args) {
		logger.info("In main method");
		int a = 0;
		int b = 10;

		if (a == 0) {
			logger.error("Cannot perform division: divisor 'a' is zero.");
		} else {
			int cal = b / a;
			logger.info("Division result: {}", cal);
		}

		SpringApplication.run(SamplecodeApplication.class, args);
	}

}