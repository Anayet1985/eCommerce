package com.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.common.CommonBase;
import com.pages.QuickFindPages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class QuickFindSteps {

	WebDriver driver;
	
	QuickFindPages qp;
	
	@Given("^I am on a oscommerce hompage$")
	public void i_am_on_a_oscommerce_hompage() throws Throwable {
	 driver=CommonBase.getdriver("chrome", driver);
	 driver.get(CommonBase.getGetURL());
	 qp=PageFactory.initElements(driver, QuickFindPages.class);
	  
	}

	@When("^I enter quick find product \"([^\"]*)\"$")
	public void i_enter_quick_find_product(String arg1) throws Throwable {
	    qp.getFindBox().sendKeys("phone");
	  
	}

	@When("^I click on Search Button$")
	public void i_click_on_Search_Button() throws Throwable {
	  qp.getClickQuickFind().click();  
	  
	}

	@Then("^I find realtive search products$")
	public void i_find_realtive_search_products() throws Throwable {
	    
	  
	}

}
