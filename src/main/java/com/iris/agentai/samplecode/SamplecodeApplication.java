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
			int cal = divide(b, a);
			logger.info("Result: {}", cal);
		} catch (DivisionByZeroException e) {
			logger.error("Cannot divide by zero: {}", e.getMessage());
		}

		SpringApplication.run(SamplecodeApplication.class, args);
	}

	private static int divide(int numerator, int denominator) throws DivisionByZeroException {
		if (denominator == 0) {
			throw new DivisionByZeroException("Denominator is zero");
		}
		return numerator / denominator;
	}

	public static class DivisionByZeroException extends Exception {
		public DivisionByZeroException(String message) {
			super(message);
		}
	}
}