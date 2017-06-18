package com.atguigu.test;

import org.apache.log4j.Logger;

import com.atguigu1.test.Test11;

public class Test1 {
	/**
	* Logger for this class
	*/
	private static final Logger logger = Logger.getLogger(Test1.class);
	public static void main(String[] args) {
		if (logger.isDebugEnabled()) {
			logger.debug("main(String[]) - start");
		}
		logger.warn("test1---------");
		String method1 = Test11.method1();
		System.out.println(method1);
		if (logger.isDebugEnabled()) {
			logger.debug("main(String[]) - end");
		}
	}

}
