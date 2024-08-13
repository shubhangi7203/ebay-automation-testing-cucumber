package com.qa.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swaglab_ele {
	WebDriver driver;
	@FindBy(xpath="//input[@placeholder='Username']") public WebElement str_username;
	@FindBy(xpath="//input[@placeholder='Password']") public WebElement str_password;
	@FindBy(xpath="//input[@name=\\\"login-button\\\"]") public WebElement login;
	
	public Swaglab_ele(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
}
