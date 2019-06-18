package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrivacyPages {

	
	WebDriver driver;
	
	public PrivacyPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//a[contains(text(),'Privacy Notice')]")
	private WebElement Parivacy;

	public WebElement getParivacy() {
		return Parivacy;
	}
}
