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
import org.testng.annotations.Test;

public class BrokenLinks {

	@Test
	public void Brokenlinks() throws MalformedURLException, IOException
	{
		HttpURLConnection HUC = null;
		int rescode =200;
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.zlti.com");
		
	List<WebElement> links  =	driver.findElements(By.tagName("a"));
		driver.findElement(By.tagName("img"));
		
		for(WebElement S : links)
		{
		
			
			String url  = S.getAttribute("href");
		    if(!url.startsWith("http://www.zlti.com"))
		   continue;
		   
		    //System.out.println(url);
		HUC = (HttpURLConnection)(new URL(url).openConnection());
		
		//HUC.setRequestMethod("HEAD");
		HUC.connect();
	    rescode =	HUC.getResponseCode();
	
	if(rescode<400)
		System.out.println(url+"----"+"Valid");
	
		
		}
		
		
	}
	
	
}
