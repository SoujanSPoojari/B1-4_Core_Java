package com.JUNIT_Testing;

//import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class JUnitExample8 {
	@BeforeAll   
	static void display()
	{
		System.out.println("Soujan");
	}
	@Test
	void display1()
	{
		System.out.println("James");
	}
}
