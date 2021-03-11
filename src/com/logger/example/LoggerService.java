package com.logger.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggerService {
	static Logger logger = Logger.getLogger(LoggerService.class.getName());

	public void get() {
		
	
		logger.log(Level.INFO, "Config data");
		logger.log(Level.INFO, "Config data");
		logger.log(Level.INFO, "Config data");
		System.out.println("Noor.....");
	}
}
