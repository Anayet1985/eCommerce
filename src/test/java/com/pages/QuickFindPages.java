package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuickFindPages {

	WebDriver driver;
	
	public QuickFindPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	
	@FindBy(xpath="//input[@type='text']")
	
	private WebElement FindBox;

	public WebElement getFindBox() {
		return FindBox;
	}
	
	@FindBy(xpath="//input[@type='image']")
	
	private WebElement ClickQuickFind;

	
	public WebElement getClickQuickFind() {
		return ClickQuickFind;
	}
	
	
}
