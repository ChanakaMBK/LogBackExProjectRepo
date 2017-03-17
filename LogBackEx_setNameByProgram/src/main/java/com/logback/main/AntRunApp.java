package com.logback.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author chanaka.k
 *
 */
public class AntRunApp {
	
	private final Logger logger = LoggerFactory.getLogger(AntRunApp.class);
	
	public static void main(String args[]) {
		
		//Set this before the logger start.
		System.setProperty("log.name", "chanaka");
		AntRunApp runApp = new AntRunApp();
		runApp.start();
		
	}
	
	private void start() {
		logger.debug("-----------Starting ANT-------------");
	}
}
