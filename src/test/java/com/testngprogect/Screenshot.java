package com.testngprogect;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Screenshot {

	public static void getscreenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source  = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File ("F:\\JavaWithSelenium\\TestNGProject\\src\\test\\java\\abc.png"));
	}
	
	
	@Test
	public void screenshot() throws IOException
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		Screenshot.getscreenshot(driver);
		
		driver.findElement(By.tagName("a"));
		
	}
	
}
