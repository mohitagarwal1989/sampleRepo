package com.iris.agentai.samplecode;

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
		try {
			if (a == 0) {
				throw new IllegalArgumentException("Denominator 'a' cannot be zero");
			}
			int cal = b / a;
			logger.info("Calculation result: {}", cal);
		} catch (IllegalArgumentException e) {
			logger.error("Invalid input for calculation: {}", e.getMessage());
		}

		SpringApplication.run(SamplecodeApplication.class, args);
	}

}