package com.qa.testrunner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\ADITIGOVIND\\eclipse-workspace\\BDD.cucumber.selenium\\src\\test\\java\\com\\qa\\feature\\Ebay.feature"},
		glue = {"com.qa.stepdefinition"},
		plugin = {"pretty", "html:Report1.html"},
		dryRun = false,
		monochrome = true,
		tags = "@T1" 
		
		//name = {"logo"}
		)
public class G_TestRunner1 extends AbstractTestNGCucumberTests {
	
	
}
