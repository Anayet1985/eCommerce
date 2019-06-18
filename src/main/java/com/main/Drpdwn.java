package com.main;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Drpdwn {

	WebDriver driver;
	@Test(enabled=false)
	public void select_music() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Select slt = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
				slt.selectByVisibleText("Amazon Fresh");
		 
		WebElement we = slt.getFirstSelectedOption();
		System.out.println(we);
	}
	@Test(enabled=true)
		public void mshover() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 Actions ac = new Actions(driver);
		 WebElement we = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
		 ac.moveToElement(we).moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Your Hearts')]"))).click().build().perform();
}
		/*
		 * List<WebElement> option = slt.getOptions();
		 * System.out.println(option.size()); System.out.println("-----------------");
		 * for(int i=0); i<option.size();i++){
		 * System.out.println(option.get(i).getText()); }
		 */
	
}
