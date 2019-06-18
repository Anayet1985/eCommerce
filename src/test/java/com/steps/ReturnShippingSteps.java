package com.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.common.CommonBase;
import com.pages.ReturnPages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReturnShippingSteps {
	
	WebDriver driver;
	
	ReturnPages rp;

	@Given("^I'm on a homepage$")
	public void i_m_on_a_homepage() throws Throwable {
	    driver=CommonBase.getdriver("chrome", driver);
	    driver.get(CommonBase.getGetURL());
	    rp=PageFactory.initElements(driver, ReturnPages.class);
	   
	}

	
	@When("^user click Shippiing Return Button$")
	public void user_click_Shippiing_Return_Button() throws Throwable {
	    rp.getShippingReturn().click();
	   
	}

	@Then("^Shipping and Return terms visible$")
	public void shipping_and_Return_terms_visible() throws Throwable {
	    
	   
	}

}
