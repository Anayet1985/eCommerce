package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReturnPages {

	
	WebDriver driver;
	
	public ReturnPages (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[contains(text(),'Shipping & Returns')]")
	private WebElement ShippingReturn;

	public WebElement getShippingReturn() {
		return ShippingReturn;
	}
}

