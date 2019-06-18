package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayPallogPages {

	WebDriver driver;
	
	public PayPallogPages(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//span[contains(text(),'My Account')]")
    
	private WebElement MyAccount;
	public WebElement getMyAccount() {
	return MyAccount;
	}
	
	@FindBy(xpath="//b[contains(text(),'Log In with PayPal')]")
	private WebElement PayPalLog;
    public WebElement getPayPalLog() {
	return PayPalLog;
	}
	
}
