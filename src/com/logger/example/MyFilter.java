package com.logger.example;

import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class MyFilter implements Filter {


	public boolean isLoggable(LogRecord log) {
		//don't log CONFIG logs in file
		if(log.getLevel() == Level.CONFIG) return true;
		return true;
	}

}
