package com.testrun;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\sanjay\\eclipse-workspace\\Softpediaproject\\src\\main\\resources\\feature",
		plugin = {"pretty", "html:target\\cucumber-html-report",
				"json:target\\cucumber-json-report",
				"junit:target\\cucumber-junit-report",
				"com.cucumber.listener.ExtentCucumberFormatter:target\\cucmber-extent-report\\Extentreport.html"},
		tags = { "@TC01_02"},
		glue = {"com.stepdef"},
		monochrome = true
		//dryRun=false
		)

public class Runner {
	
	@AfterClass
	  public static void extendReport()
	{
		Reporter.loadXMLConfig("src\\test\\resources\\exten-config.xml");
	    Reporter.setSystemInfo("user", System.getProperty("user.name"));
	    Reporter.setSystemInfo("os", "Windows");
	    Reporter.setTestRunnerOutput("Sample test runner output message");
	}
}
