package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NullLogInPages {

	
	WebDriver driver;
	
	public NullLogInPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	private WebElement Myaccount;

	public WebElement getMyaccount() {
		return Myaccount;
	}
	@FindBy(xpath="//span[contains(text(),'Sign In')]")
	private WebElement NullValue;

	public WebElement getNullValue() {
		return NullValue;
	}
}
