package com.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.common.CommonBase;
import com.pages.NullLogInPages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NullLogInSteps {
	
	WebDriver driver;
	
	NullLogInPages nip;

	@Given("^I'm on a longin page$")
	public void i_m_on_a_longin_page() throws Throwable {
	   driver=CommonBase.getdriver("chrome", driver);
	   driver.get(CommonBase.getGetURL());
	   nip=PageFactory.initElements(driver, NullLogInPages.class);
	   nip.getMyaccount().click();
	}

	@When("^Enter blank user and password$")
	public void enter_blank_user_and_password() throws Throwable {
	   nip.getNullValue().click();
	   
	}

	@Then("^Should be displayed an error message$")
	public void should_be_displayed_an_error_message() throws Throwable {
	   driver.getTitle();
	   String pageTitle = driver.getTitle();
	   System.out.println("My Null login page Title Name is ::"+pageTitle );
	   if (driver.getTitle().equalsIgnoreCase("osCommerce demo")) {
		   System.out.println("My Validation Pass");
	   } 
		   else 
			   System.out.println("My Validation Fail");
			   
	   }
	}

