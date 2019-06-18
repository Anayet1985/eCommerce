package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.common.CommonBase;
import com.pages.ValidLogInPages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidLoginSteps {

	WebDriver driver;
	
	ValidLogInPages vlp;

	

	@Given("^I am on login  page$")
	public void i_am_on_login_page() throws Throwable {
	   driver=CommonBase.getdriver("chrome", driver);
	   driver.get(CommonBase.getGetURL());
	   vlp=PageFactory.initElements(driver, ValidLogInPages.class);
	   vlp.getGotoLogin().click();
	}

	@When("^Enter a valid email address as a \"([^\"]*)\" and password as a\"([^\"]*)\"$")
	public void enter_a_valid_email_address_as_a_and_password_as_a(String arg1, String arg2) throws Throwable {
	   driver.findElement(By.name("email_address")).sendKeys("anayet.amails@gmail.com");
	   driver.findElement(By.name("password")).sendKeys("Myproject19");
	   vlp.getClickSignIN().click();
	}

	@Then("^I Should login succesfully$")
	public void i_Should_login_succesfully() throws Throwable {
	   driver.getTitle();
	   String pageTitle = driver.getTitle();
	   System.out.println("My Valid Login page Title Name is ::"+pageTitle);
	   if(driver.getTitle().equalsIgnoreCase("osCommerce demo")) {
		   System.out.println("My Validation Pass");
	   }
	   else 
		   System.out.println("My Validation fail");
	}
}
