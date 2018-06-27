package com.testngprogect;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.WrapsDriver;
import org.testng.annotations.Test;

public class GenericMethodforXPath 
{   
	static WebDriver driver = new FirefoxDriver();
	
 public static Properties prop  = new Properties(); 
	
	
	
	public static WebElement  genericMethodforlocator(String locatortype, String locator) throws IOException
	{
		WebElement element = null;
	
		
		
		if(locatortype.equalsIgnoreCase("Xpath"))
		 element =	driver.findElement(By.xpath(locator));	
	   else if(locatortype.equalsIgnoreCase("Id"))
	   element=  driver.findElement(By.id(locator));
	   return element;
	}
		
	@Test
	public  void test1() throws IOException
	{
	File f = new File("F:\\JavaWithSelenium\\TestNGProject\\src\\main\\java\\testfile.properties");
		
	if(f.exists())
	{
	FileInputStream FIs = new FileInputStream(f);
	prop.load(FIs);
	}
		driver.get("http://www.google.com");
		//GenericMethodforXPath.genericMethodforlocator("xpath","//a[text()='Gmail']").click();
		
		GenericMethodforXPath.genericMethodforlocator("xpath", prop.getProperty("gmail")).click();
	}
	
}
