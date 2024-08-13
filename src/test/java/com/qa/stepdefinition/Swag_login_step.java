package com.qa.stepdefinition;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Swag_login_step {
	WebDriver driver;
	public Swag_login_step(Common_block common_block)
	{
	this.driver=common_block.getDriver();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	WebDriverWait wait;
	
@Given("User is on swagLabs page")
public void user_is_on_swag_labs_page() throws InterruptedException {
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	//Thread.sleep(1000);
	System.out.println("I am on swaglabs login page");
    
}

@When("User login to swaglabs with {string} and {string}")
public void user_login_to_swaglabs_with_and(String string, String string2) throws InterruptedException {
 // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']"))).sendKeys(string);
 // WebElement username=driver.findElement((By.xpath("//input[@placeholder='Username']")));
  //Thread.sleep(2000);
 //wait=new WebDriverWait(driver,Duration.ofSeconds(10));
 //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']"))).sendKeys(string);
 // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(string);
 Thread.sleep(2000);
  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(string2);
  Thread.sleep(2000);
  driver.findElement(By.xpath("//input[@name=\"login-button\"]")).click();
 Thread.sleep(2000);
}

@Then("^Page with title (.+) should be open$")
public void page_with_title_should_be_open(String string) throws InterruptedException {
if(string.equals(driver.getTitle()))
{
	System.out.println("page navigate to "+string);
	Thread.sleep(2000);
}
else
{
	System.out.println("page does not navigate to "+string);
}
}

@When("User click on logout")
public void user_click_on_logout() throws InterruptedException {
    
	driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id=\"logout_sidebar_link\"]")).click();
}

}
