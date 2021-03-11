package com.logger.example;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Test1 {
	public static void main(String[] args) {

		Logger logger = Logger.getLogger("MyLog");
		FileHandler fh;

		try {

			// This block configure the logger with handler and formatter
			fh = new FileHandler("D://logger.log");
			logger.setLevel(Level.INFO);
			logger.addHandler(fh);
			SimpleFormatter formatter = new SimpleFormatter();
			fh.setFormatter(formatter);

			// the following statement is used to log any messages
			logger.info("My first log");

		} catch (Exception e) {
			e.printStackTrace();
		}

		logger.info("Hi How r u?");
	}
}