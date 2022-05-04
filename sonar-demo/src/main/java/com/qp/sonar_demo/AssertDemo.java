package com.qp.sonar_demo;

import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class AssertDemo {
	static Logger logger = Logger.getLogger(AssertDemo.class);

	public static void main(String[] args) {

		int i = 30;		
		if(i>=20) { 

		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		logger.debug("this is a debug log message");
		logger.info("this is a information log message");
		logger.warn("this is a warning log message");
			}
	}
}
