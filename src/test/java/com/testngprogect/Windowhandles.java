package com.testngprogect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Windowhandles {
	
	@Test
	public void multiplewindowHandle()
	{
		
	WebDriver driver = new FirefoxDriver();
	driver.get("http://toolsqa.com/automation-practice-switch-windows/");
	String Parent = driver.getWindowHandle();
	System.out.println("window Handle" +Parent);
	
	driver.findElement(By.xpath("//button[@id ='button1']")).click();
	
Set<String > MultipleWindows =	driver.getWindowHandles();

List<String> WindowList = new ArrayList<String>(MultipleWindows);

System.out.println("testWindow=" +WindowList.get(0));

	 driver.switchTo().window(WindowList.get(1));
	 System.out.println( "Windows 2------ " +driver.getTitle());
	 driver.close();
	 driver.switchTo().window(Parent);

	 System.out.println(driver.getTitle());
	 
	 
}




	
	


	
		
		
		
	}


