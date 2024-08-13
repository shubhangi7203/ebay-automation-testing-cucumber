package com.qa.action;

import org.openqa.selenium.WebDriver;


import com.qa.elements.Swaglab_ele;
import com.qa.stepdefinition.Common_block;


public class Swaglab_act {
	private WebDriver driver;
	Swaglab_ele swaglab_ele;
	
	
	public Swaglab_act(Common_block common_block)
	{
		this.driver=common_block.getDriver();	
		swaglab_ele= new Swaglab_ele(driver);
	}

	public void enterusername(String user)
	{
		swaglab_ele.str_username.sendKeys(user);
	}
}
