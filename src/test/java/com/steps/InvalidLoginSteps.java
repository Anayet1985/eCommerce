package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.common.CommonBase;
import com.pages.InvalidLogInPages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidLoginSteps {
	
	WebDriver driver;
	InvalidLogInPages iip;
	

	@Given("^I'm on Login page$")
	public void i_m_on_Login_page() throws Throwable {
	   driver=CommonBase.getdriver("chrome", driver);
	   driver.get(CommonBase.getGetURL());
	   iip=PageFactory.initElements(driver, InvalidLogInPages.class);
	   iip.getGotoLogin().click();
	}

	@When("^Enter invalid username and password$")
	public void enter_invalid_username_and_password() throws Throwable {
	   
	   driver.findElement(By.name("email_address")).sendKeys("anayet");
	   driver.findElement(By.name("password")).sendKeys("anayet");
	   iip.getClickSignIN().click();
	
	}

	@Then("^I should be displayed  an error message$")
	public void i_should_be_displayed_an_error_message() throws Throwable {
	   driver.getTitle();
	   String pageTitle = driver.getTitle();
	   System.out.println("My Invalid login page Title Name is ::"+pageTitle);
	   if(driver.getTitle().equalsIgnoreCase("osCommerce demo")) {
		   
		   System.out.println("My Validation Pass");
	   }
	   else
		   System.out.println("My Validation Fail");
	}

	@Then("^Should remain on the login screen$")
	public void should_remain_on_the_login_screen() throws Throwable {
	   
	   
	}
}
