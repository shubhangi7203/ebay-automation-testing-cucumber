package com.qa.stepdefinition;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Form_step {
	
	@Given("I am student practice form page")
	public void i_am_student_practice_form_page() {
	    System.out.println("user is on practice form page");
	}

	@When("Enter the details")
	public void enter_the_details(List<String> data) {
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
	}

	@Then("Click on submit")
	public void click_on_submit() {
		System.out.println("user click on submit button");
	}

}
