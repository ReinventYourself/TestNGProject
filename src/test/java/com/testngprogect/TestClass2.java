package com.testngprogect;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.testngprogect.TestListener.class)
public class TestClass2 {

	/*@BeforeTest
	public void beforetest2()
	{
		
		System.out.println("beforetest2");
		
	}*/
	
	
	
	@Test

	public void TestClass2Method()
	{
		
		System.out.println("TestClass2Method");
		
	}
	
	
}
