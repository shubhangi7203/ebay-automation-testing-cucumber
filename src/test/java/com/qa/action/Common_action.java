package com.qa.action;

import org.openqa.selenium.WebDriver;

import com.qa.stepdefinition.Common_block;


public class Common_action {

	private WebDriver driver;
	Common_block common_block;
	
	public Common_action(Common_block common_block)
	{
		this.driver=common_block.getDriver();
	}
	
	public void gotourl(String url)
	{
		driver.get(url);
	}
	
	public void maxWindow()
	{
		driver.manage().window().maximize();
	}
	public String getCurrentPageUrl()
	{
		return driver.getCurrentUrl();
	}
	public String getCurrentPageTitle()
	{
		return driver.getTitle();
	}
	public void quiteDriver()
	{
		driver.quit();
	}
	
}
