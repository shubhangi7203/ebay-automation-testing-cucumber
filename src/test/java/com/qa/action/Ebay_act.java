package com.qa.action;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.elements.Ebay_ele;
import com.qa.stepdefinition.Common_block;

import io.cucumber.java.Scenario;

public class Ebay_act {
	
	private WebDriver driver;
	Ebay_ele ebay_ele;
	
	public Ebay_act(Common_block common_block)
	{
	this.driver=common_block.getDriver();	
	ebay_ele= new Ebay_ele(driver);
	}
	
	public void clickAdvLink(String string1,Scenario scenario)
	{
		ebay_ele.string1.click();
		TakesScreenshot ts=((TakesScreenshot)driver);
		final byte[] scr=ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(scr,"image/png",scenario.getName());
		System.out.println("Screenshot captured");
		//driver.findElement(By.linkText(string1)).click();	}
	}

	
	public void ClickOnLink(String str1)
	{
		WebElement text=driver.findElement(By.linkText(str1));
		Assert.assertTrue(text.isDisplayed());
		text.click();
	}
	

	
}
