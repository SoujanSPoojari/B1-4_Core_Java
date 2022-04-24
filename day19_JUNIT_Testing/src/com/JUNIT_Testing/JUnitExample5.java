package com.JUNIT_Testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class JUnitExample5 {
	@Test
	void accept()
	{
		System.setProperty("1", "Soujan");
		Assumptions.assumeFalse("Soujan".equals(System.getProperty("2")));
		
		 
	}
}
