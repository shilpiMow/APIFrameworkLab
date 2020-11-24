package com.lab.base;

import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.lab.readExcel.ReadProperties;



public class Browser {
	static WebDriver dr;
	
	public static WebDriver Open() {
		Properties p=ReadProperties.ReadOne("src/test/resources/properties/confic.Properties");
		System.setProperty("webdriver.chrome.driver", p.getProperty("driver_path"));
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		
		
		return dr;
		
		
	}
	
}
