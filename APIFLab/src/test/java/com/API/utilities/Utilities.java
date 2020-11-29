package com.API.utilities;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Utilities {
	static String cdir = System.getProperty("user.dir");

	public static void main(String[] args) {
		System.out.println(cdir);
	}
	
	
	public static Logger getLog(Class clazz) {
		Logger log = Logger.getLogger(clazz);
		PropertyConfigurator.configure("src/test/resources/log4j.properties");
		return log;

	}
	
	
	
	

	public static Properties readPropFile() {
		Properties pro = new Properties();
		try {
			FileInputStream f = new FileInputStream(cdir +"\\src\\test\\resources\\Properties\\config.Properties");
			pro.load(f);
        
		} catch (Exception e) {

			System.out.println(e.getMessage());

		}
		return pro;
	}
}

