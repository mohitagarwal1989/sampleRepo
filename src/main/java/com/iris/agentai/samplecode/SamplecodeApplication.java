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
		try {
			validateArgs(args);
			int a = 0;
			int b = 10;
			SpringApplication.run(SamplecodeApplication.class, args);
		} catch (InputValidationException e) {
			logger.error("Invalid input arguments: {}", e.getMessage());
			// Handle the error appropriately, e.g., exit the application
		}
	}

	private static void validateArgs(String[] args) throws InputValidationException {
		if (args == null || args.length == 0) {
			throw new InputValidationException("No arguments provided");
		}
	}

	// Specific checked exception for input validation errors
	public static class InputValidationException extends Exception {
		public InputValidationException(String message) {
			super(message);
		}
	}
}