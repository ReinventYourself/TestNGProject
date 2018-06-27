package com.testnG.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInit {

	private static DriverInit InstanceDriver = null;
	private WebDriver driver;
	
	private DriverInit(){}
	
	public WebDriver openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\JavaWithSelenium\\Setup\\chromedriver.exe");
		driver  = new ChromeDriver();
		return driver;
	}
	
	public static DriverInit getInstance()
	{
		if(InstanceDriver ==null)
			InstanceDriver = new DriverInit();
		return InstanceDriver;
	}}
