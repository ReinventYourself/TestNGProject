package com.testngprogect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class DropdownwithSelect {

	@Test 
	public void dropdown() throws InterruptedException
	{
		
      WebDriver driver = new FirefoxDriver();
      
      driver.get("https://accounts.google.com/ServiceLogin/signinchooser?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.co.in%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	
      
      driver.findElement(By.xpath(".//*[@id='lang-chooser']/div[1]/div[1]")).click();
      Thread.sleep(1000);
      
     List<WebElement>  list = driver.findElements(By.xpath("//*[@id='lang-chooser']/div[2]/div"));
     
     list.get(2).click();
     
     System.out.println("Size ="+list.size());
    
     for(int i = 1;i<=list.size();i++)
     { 
    	  String St =  driver.findElement(By.xpath("//*[@id='lang-chooser']/div[2]/div[" + i +"]/content")).getText();
    	  System.out.println("Strring ="+St);
    
     }	
		
	}
	
	
	
}
