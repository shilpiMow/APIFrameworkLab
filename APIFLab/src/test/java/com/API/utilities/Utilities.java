package com.API.utilities;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Utilities {

	public static Logger getLog(Class clazz) {
		Logger log = Logger.getLogger(clazz);
		String osName=System.getProperty("os.name");
		if(osName.contains("Mac")) {
			PropertyConfigurator.configure("src/test/resources/log4j.properties");	
		}else {
			PropertyConfigurator.configure("src\\test\\resources\\log4j.properties");
		}
		
		return log;

	}

	public static Properties readPropFile() {
		Properties pro = new Properties();
		try {
			FileInputStream f = new FileInputStream("/ExcelHomework/src/main/resources/drivers/chromedriver.exe");
			pro.load(f);

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}
		return pro;
	}
}

