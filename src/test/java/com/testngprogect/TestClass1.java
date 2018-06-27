package com.testngprogect;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1  {
	
	/*@BeforeTest
	public void beforetest1()
	{
		System.out.println("BeforeTest1");
		
	}
	
	@BeforeClass
	public void beforeclass1()
	{
	System.out.println("BeforeClass1");	
	}
	
	
	@BeforeMethod
	public void beforemethod1()
	{
		System.out.println("BeforeMethod1");
		
	}*/
	
	
	@Test
	public void method3()
	{
		
		
		 int rescode =200;
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.zlti.com");
	    List<WebElement> Lst =   driver.findElements(By.tagName("a"));
	    
	     int totallink = Lst.size();
	
	for(WebElement url : Lst)
	{
		
	String link = 	url.getAttribute("href");
		
		
		try {
			HttpURLConnection huc = (HttpURLConnection)(new URL(link).openConnection());
		    huc.setRequestMethod("HEAD");
			huc.connect();
	 rescode =    huc.getResponseCode();
		 if(rescode>=400)
			 System.out.println(link+ " "+ "is a broken link");
		 else 
		 System.out.println(link + " " + "Link is valid");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	System.out.println(totallink);
	
	}
	
	

	
	
	

	
}
