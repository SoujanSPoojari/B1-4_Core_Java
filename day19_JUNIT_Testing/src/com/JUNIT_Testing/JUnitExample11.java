package com.JUNIT_Testing;

import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Assumptions;

public class JUnitExample11 {
	void accept()
	{
		System.setProperty("1", "Soujan");
		Assertions.assertFalse("Soujan".equals(System.getProperty("2")));
		
		 
	}
}
