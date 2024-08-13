package com.qa.stepdefinition;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdvancedSearch_step {
	WebDriver driver;
	
	public AdvancedSearch_step(Common_block common_block)
	{
	this.driver=common_block.getDriver();
	}
	
	@Given("I am on ebay advanced search page")
	public void i_am_on_ebay_advanced_search_page() throws InterruptedException {
		driver.get("https://www.ebay.com/sch/ebayadvsearch");
		driver.manage().window().maximize();
		System.out.println("user is on advanced ebay page");
		 Thread.sleep(2000);
		
	}

	@When("I click on logo")
	public void i_click_on_logo() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"gh-la\"]")).click();
		 Thread.sleep(2000);
		System.out.println("user click on logo");
	    
	}

	@Then("I  am navigate to ebay home page")
	public void i_am_navigate_to_ebay_home_page() throws InterruptedException {

	    String expect="https://www.ebay.com/";
	    String actual=driver.getCurrentUrl();
	    if(!expect.equals(actual))
	    {
	    	fail("page does not navigate");
	    }
	    else
	    {
	    	System.out.println("User naigate to advanced page");
	    }
	    Thread.sleep(2000);
	   
		System.out.println("user is on home page");

	}
	
	@When("I advanced search an item")
	public void i_advanced_search_an_item(DataTable dataTable) throws InterruptedException {
	   driver.findElement(By.xpath("//*[@id=\"_nkw\"]")).sendKeys(dataTable.cell(1,0));
	   driver.findElement(By.xpath("//*[@id=\"_ex_kw\"]")).sendKeys(dataTable.cell(1,1));
	   driver.findElement(By.xpath("//*[@id=\"s0-1-17-5[2]-@range-comp[]-@range-textbox[]-textbox\"]")).sendKeys(dataTable.cell(1,2));
	   driver.findElement(By.xpath("//*[@id=\"s0-1-17-5[2]-@range-comp[]-@range-textbox[]_1-textbox\"]")).sendKeys(dataTable.cell(1,3));
	   driver.findElement(By.xpath("/html/body/div[2]/div/main/form/div[2]/button")).click();
	   Thread.sleep(2000);
	}

}
