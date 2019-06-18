package com.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.common.CommonBase;
import com.pages.PrivacyPages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PrivacySteps {
	
	WebDriver driver;
	
	PrivacyPages ppg;

	@Given("^I'm on homepage$")
	public void i_m_on_homepage() throws Throwable {
	   driver=CommonBase.getdriver("chrome", driver);
	   driver.get(CommonBase.getGetURL());
	   ppg=PageFactory.initElements(driver, PrivacyPages.class);
	    
	}

	@When("^user click privacy notice button$")
	public void user_click_privacy_notice_button() throws Throwable {
	   ppg.getParivacy().click();
	    
	}

	@Then("^Privacy condtions visible$")
	public void privacy_condtions_visible() throws Throwable {
	   
	    
	}
}
