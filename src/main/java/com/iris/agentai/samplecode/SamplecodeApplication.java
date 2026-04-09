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
		SpringApplication.run(SamplecodeApplication.class, args);

		logger.error("Exception occurred");
		// Graceful handling: log the error and allow the application to shut down cleanly
		// No exception is thrown to avoid abrupt termination
	}
}