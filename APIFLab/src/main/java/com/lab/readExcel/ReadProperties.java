package com.lab.readExcel;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties {

	
	public static Properties ReadOne(String driver_path) {
		Properties p= new Properties();
			try {
		FileInputStream fl=new FileInputStream(driver_path);
		p.load(fl);	
			
		} catch (Exception e) {
		}
			return p;
	}
	
	
	
}
