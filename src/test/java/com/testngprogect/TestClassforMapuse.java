package com.testngprogect;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClassforMapuse {

	public static void main(String[] args) {
		WebDriver driver =  new FirefoxDriver();
		driver.get("https://www.freecrm.com");
		
	String usercredentials = UseofMap.getcredentials().get("admin");
	String usercredentialsinfo[] =usercredentials.split("_");
		

		driver.findElement(By.name("username")).sendKeys(usercredentialsinfo[0]);
		driver.findElement(By.name("password")).sendKeys(usercredentialsinfo[1]);

		

	}

}
