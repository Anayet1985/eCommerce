package com.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.common.CommonBase;
import com.pages.CheckOutPages;
import com.util.ScreenShot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Checkout {

	WebDriver driver;
	
	CheckOutPages cop;
	
	
	@Given("^User select the product$")
	public void user_select_the_product() throws Throwable {
		driver=CommonBase.getdriver("chrome", driver);
		driver.get(CommonBase.getGetURL());
		cop=PageFactory.initElements(driver, CheckOutPages.class);
	    
	}

	@When("^User click add to cart$")
	public void user_click_add_to_cart() throws Throwable {
	    cop.getSelectProduct().click();
	    cop.getAddToCart().click();
	    ScreenShot.SS(driver,"add to cart");
	}

	@When("^He clicks checkout button$")
	public void he_clicks_checkout_button() throws Throwable {
	    cop.getCheckOut().click();
	    
	}

	@Then("^User see check out page appeard$")
	public void user_see_check_out_page_appeard() throws Throwable {
	    
	    
	}
}
