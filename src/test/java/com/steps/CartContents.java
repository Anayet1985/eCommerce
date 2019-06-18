package com.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.common.CommonBase;
import com.pages.CartPages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CartContents {
	
	WebDriver driver;
	
	CartPages cp;
	
	@Given("^The user is on product page$")
	public void the_user_is_on_product_page() throws Throwable {
		driver=CommonBase.getdriver("chrome", driver);
		driver.get(CommonBase.getGetURL());
		cp=PageFactory.initElements(driver, CartPages.class);
	}  

	@When("^He clicks on of product$")
	public void he_clicks_on_of_product() throws Throwable {
	   cp.getFindProduct().click();
	}

	@When("^He clicks the Add to Cart Button$")
	public void he_clicks_the_Add_to_Cart_Button() throws Throwable {
	 
	    cp.getAddCart().click();
	}

	@Then("^one of product added his Cart Contents$")
	public void one_of_product_added_his_Cart_Contents() throws Throwable {
	    
	    
	}

	
}
