package com.qa.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.action.Common_action;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MakeMyTrip_step {
	WebDriver driver;
	public MakeMyTrip_step(Common_block common_block)
	{
		
	this.driver=common_block.getDriver();
	}
	@Given("login with test account")
	public void login_with_test_account() throws InterruptedException {
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("make my trip flights");
	}

	@When("select {string} from location and {string} as to location")
	public void select_from_location_and_as_to_location(String string, String string2) {
System.out.println("pune to mumbai");
		//driver.findElement(By.xapth("//input[@placeholder=\"From\"]"))
	}
}
