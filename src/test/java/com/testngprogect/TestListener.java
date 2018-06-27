package com.testngprogect;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class TestListener implements ISuiteListener {

	public void onStart(ISuite suite) {
		
		System.out.println("Suite Started");
		
	}

	public void onFinish(ISuite suite) {
		
		System.out.println("Suite Finish");
	}

}
