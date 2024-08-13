package com.qa.stepdefinition;

import static org.junit.Assert.fail;

//import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.action.Common_action;

import com.qa.action.Ebay_act;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ebay_Stepdefinition {
	WebDriver driver;
	Ebay_act ebay_act;
	Common_action common_action;
	Scenario scenario;
	
	public Ebay_Stepdefinition(Common_action common_action,Ebay_act ebay_act)
	{
		this.common_action=common_action;
		this.ebay_act=ebay_act;
	}
	
	@Given("I am on ebay home page")
	public void i_am_on_ebay_home_page() throws InterruptedException {
		
		common_action.gotourl("https://www.ebay.com/");
		common_action.maxWindow();
		Thread.sleep(2000);
		System.out.println("User is on ebay page");
	}

	@When("I click on Advanced Link")
	public void i_click_on_advanced_link() throws InterruptedException {
		Thread.sleep(1000);
	   // driver.findElement(By.xpath("//*[text()=\"Advanced\"]")).click();
	 //   ebay_act.clickAdvLink();
		System.out.println("User click on Advanced page");
	}

	@Then("I validate the page navigate to {string}")
	public void i_validate_the_page_navigate_to(String url) {
	   String expect=common_action.getCurrentPageUrl();
			
	    if(!expect.equals(url))
	    {
	    	fail("page does not navigate");
	    }
	    else
	    {
	    	System.out.println("User navigate to advanced page");
	    	 
	    }
	    
	}
	
	
	
	@When("I search for {string}")
	public void i_search_for_adidas_shoes(String str1) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys(str1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		
		Thread.sleep(2000);
	}
	

	@Then("I validate atleast {int} search item present")
	public void i_validate_atleast_search_item_present(int count) {
		 String search_count=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div[2]/div[1]/div[1]/div[1]/h1/span[1]")).getText();
		   String search_count2=search_count.replace(",","");
		   int itemcount=Integer.parseInt(search_count2);
		   	   if(itemcount<=count)
		   {
			   fail("search item is less than 10000");
		   }
		   System.out.println("I found "+itemcount+" items");
	    
	}
	
	@Then("I validate atleast {int} search item is present")
	public void i_validate_atleast_search_item_is_present(Integer int1) {
		String search_count=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[1]/div[1]/div[1]/h1/span[1]")).getText();
		   String search_count2=search_count.replace(",","");
		   int itemcount=Integer.parseInt(search_count2);
		   	   if(itemcount<=int1)
		   {
			   fail("search item is less than 10000");
		   }
		   System.out.println("I found "+itemcount+" items");
	}

	@When("I click on {string}")
	public void i_click_on(String string) throws InterruptedException {
		Scenario scenario = null;
		ebay_act.ClickOnLink(string);
//		TakesScreenshot ts=((TakesScreenshot)driver);
//		final byte[] scr=ts.getScreenshotAs(OutputType.BYTES);
//		scenario.attach(scr,"image/png",scenario.getName());
//		System.out.println("Screenshot captured");
	   Thread.sleep(3000);
	}
	@Then("I validate the page navigate to {string} and title contain {string}")
	public void i_validate_the_page_navigate_to_and_title_contain(String url, String title) {
		String accUrl=common_action.getCurrentPageUrl();
		String accTitle=common_action.getCurrentPageTitle();
	
		if(!accUrl.equals(url))
		{
			fail("page does not navigate to "+ url );
			//fail();
		}
		else
		{
			System.out.println("page navigate to "+ title);
		}
		
		if(!accTitle.contains(title))
		{
			fail("title mismatch");
		}
		else
		{
			System.out.println("page title is "+ accTitle);
		}
	}
	}


