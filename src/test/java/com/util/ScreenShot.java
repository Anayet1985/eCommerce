package com.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/*import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.sun.java.util.jar.pack.Package.File;
*/
public class ScreenShot {

	WebDriver driver;
	
	public static void SS(WebDriver driver, String sign) throws IOException {
		
		TakesScreenshot tkss = (TakesScreenshot)driver;
		File fl = tkss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fl,new File("./ScreenShott"+sign+".png"));
	}
}
