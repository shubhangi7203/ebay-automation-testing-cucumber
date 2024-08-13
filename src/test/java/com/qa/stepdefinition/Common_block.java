package com.qa.stepdefinition;




import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Common_block {
	private WebDriver driver;
	//private WebDriverWait wait;
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		
	}
	
	@AfterStep("@S1")
	//@After("@T1")
	public void Afterstep(Scenario scenario)
	{
		if(!scenario.isFailed())
		{
		TakesScreenshot ts=((TakesScreenshot)driver);
		final byte[] scr=ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(scr,"image/png",scenario.getName());
//		System.out.println("Name: "+scenario.getName());
//		System.out.println("fail or pass: "+scenario.isFailed());
//		System.out.println("status: "+scenario.getStatus());
		}
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	public WebDriver getDriver()
	{
		return driver;	
	}

}
