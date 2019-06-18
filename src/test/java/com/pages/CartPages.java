package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPages {

	WebDriver driver;
	
	public CartPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	@FindBy(xpath="//a[contains(text(),'Samsung Galaxy Tab')][1]")
	private WebElement FindProduct;

	public WebElement getFindProduct() {
		return FindProduct;
	}
	@FindBy(xpath="//span[contains(text(),'Add to Cart')]")
	private WebElement AddCart;

	public WebElement getAddCart() {
		return AddCart;
	}
}
