package com.Exception;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		try
		{
			int res=a/0;
			System.out.println(res);
		}
		catch(Exception c)
		{
			System.out.println("Exception Handled");
		}
		finally
		{
			System.out.println("Exception Handling in java");
		}
		s.close();

	}

}
