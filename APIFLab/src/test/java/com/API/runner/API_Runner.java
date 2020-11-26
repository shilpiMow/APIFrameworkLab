package com.API.runner;


import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src\\test\\java\\com\\API\\features\\Rest_API.feature"},
        glue= {"com.API.Steps"},
		//tags= {"@test"},
		plugin = {"pretty", "json:target/report.json"}
		)

@Test
public class API_Runner extends AbstractTestNGCucumberTests {

}
