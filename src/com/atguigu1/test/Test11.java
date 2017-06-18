package com.atguigu1.test;

import org.apache.log4j.Logger;

public class Test11 {
	/**
	* Logger for this class
	*/
	private static final Logger logger = Logger.getLogger(Test11.class);
	public static String method1(){
		if (logger.isDebugEnabled()) {
			logger.debug("method1() - start");
		}
		
		logger.debug("Test11--method1-----debug");
		
		if (logger.isDebugEnabled()) {
			logger.debug("method1() - end");
		}
		return "abc";
	}
}
