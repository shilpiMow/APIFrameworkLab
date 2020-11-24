package com.lab.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/test/java/lab/osa/features"},
        glue= {"com.lab.steps"},
		//tags= {"@test"},
		plugin = {"pretty", "html:target/cucumber-reports/report","json:target/cucumber-reports/report.json"}
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
