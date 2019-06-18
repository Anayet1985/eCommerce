package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvalidLogInPages {

	WebDriver driver;
	
	public InvalidLogInPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this );
		
	}
	
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	private WebElement GotoLogin;

	public WebElement getGotoLogin() {
		return GotoLogin;
	}
	@FindBy(xpath="//span[contains(text(),'Sign In')]")
	private WebElement ClickSignIN;

	public WebElement getClickSignIN() {
		return ClickSignIN;
	}
	
	}
	
	
	

