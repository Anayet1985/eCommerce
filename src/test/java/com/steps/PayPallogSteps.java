package com.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.common.CommonBase;
import com.pages.PayPallogPages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PayPallogSteps {
	
	WebDriver driver;
	
	PayPallogPages pp;

	@Given("^User on a homepage$")
	public void user_on_a_homepage() throws Throwable {
	    driver=CommonBase.getdriver("chrome", driver);
	    driver.get(CommonBase.getGetURL());
	    pp=PageFactory.initElements(driver,PayPallogPages.class);
	   
	}

	@When("^He Clicks My Account Button$")
	public void he_Clicks_My_Account_Button() throws Throwable {
	    pp.getMyAccount().click();
	   
	}

	@When("^User Clicks login with Paypal button$")
	public void user_Clicks_login_with_Paypal_button() throws Throwable {
	    
	   pp.getPayPalLog().click();
	}

	@Then("^Paypal sign in page Appeard$")
	public void paypal_sign_in_page_Appeard() throws Throwable {
	    driver.getTitle();// For Page title
	    String pageTitle= driver.getTitle();//
	    System.out.println("MY Sign In Validation page Title Name is ::"+pageTitle);
	    if (driver.getTitle().equalsIgnoreCase("osCommerce demo")) {
	    	 
	    	System.out.println("My Validation Pass");
	    	
	    	
	    }else 
	    	 System.out.println("My Validation Fail");
	    
	   
	}
}
