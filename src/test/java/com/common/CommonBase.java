package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class CommonBase {

	private static String getURL="https://demo.oscommerce.com";

	public static String getGetURL() {
		return getURL;
	}
WebDriver driver;

 
public static WebDriver getdriver(String driverName, WebDriver driver) {
	
	if(driverName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	    driver=new ChromeDriver();
	    
	    }
	if(driverName.equalsIgnoreCase("opera")) {
		System.setProperty("webdriver.opera.driver","./Driver/operadriver.exe");
	    driver=new OperaDriver();
}
	else if (driverName.equalsIgnoreCase("geckodriver")) {
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
	    driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	return driver;
	
}
}

