package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPages {

	WebDriver driver;
	
	public CheckOutPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
}
	@FindBy(xpath="//a[contains(text(),'Samsung Galaxy Tab')]")
    private WebElement SelectProduct;
	public WebElement getSelectProduct() {
		return SelectProduct;
	}

	
	@FindBy(xpath="//span[contains(text(),'Add to Cart')]")
	private WebElement AddToCart;

	public WebElement getAddToCart() {
		return AddToCart;
	}
	
@FindBy(xpath="//span[contains(text(),'Checkout')]")
	
	private WebElement CheckOut;

	public WebElement getCheckOut() {
		return CheckOut;
	}
}