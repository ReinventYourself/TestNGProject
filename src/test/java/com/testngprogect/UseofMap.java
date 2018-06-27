package com.testngprogect;

import java.util.HashMap;
import java.util.Map;

public class UseofMap {

	public static Map<String, String>  getcredentials()
	{
  Map<String, String> credentialmap = new HashMap<String , String>();
		
	credentialmap.put("customer", "naveenk_test@123");
	credentialmap.put("admin", "adminuser_test@123");
	
	return credentialmap;
	}

}
