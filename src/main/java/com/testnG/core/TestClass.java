package com.testnG.core;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass {

	WebDriver driver ;
	@BeforeMethod
	public void setup()
	{
	DriverInit InstanceDriver = DriverInit.getInstance();
	driver =	InstanceDriver.openbrowser();
	}
	
	
	@Test
	public void TestMethod()
	{
		
		driver.get("https://www.google.com");
		driver.getTitle();
	}
	
}
