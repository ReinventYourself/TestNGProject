package com.testngprogect;

public class ClassException {
	public void finalize()
	{
		System.out.println("finalize called");
	}  
	
	public void test()
	{
		
		System.out.println("Test Method");
	}
	public static void main(String[] args){  
		ClassException f1=new ClassException();  
	ClassException f2=new ClassException();  
	
	f1.test();
	f1=null;  
	f2=null;  
	//System.gc(); 
	//f1.test();
	
	 
	}}  
		


