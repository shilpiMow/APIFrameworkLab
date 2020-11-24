package com.lab.utilities;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Utility {
	
	public static Logger getLog(Class clazz) {
		Logger log=Logger.getLogger(clazz);
		PropertyConfigurator.configure("C:\\Users\\owner\\Desktop\\New folder (2)\\APIFrameworkLab\\APIFLab\\src\\test\\resources\\log4j.properties");
		return log;

	}
	
public static Properties readPropFile() {
	Properties pro=new Properties();
	try {
		FileInputStream f=new FileInputStream("/ExcelHomework/src/main/resources/drivers/chromedriver.exe");
	pro.load(f);
	
	} catch (Exception e) {
		
	System.out.println(e.getMessage());
	

	}
	return pro;
}

}
