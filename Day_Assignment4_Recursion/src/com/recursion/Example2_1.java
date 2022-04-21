package com.recursion;

import java.util.Scanner;

public class Example2_1 {

	 static int numberOfPaths(int m, int n)
	    {
	        if (m == 1 || n == 1)
	            return 1;
	        return numberOfPaths(m - 1, n) + numberOfPaths(m, n - 1);
	    }
	    public static void main(String args[])
	    {
	    	Scanner s= new Scanner(System.in);
			int n= s.nextInt();
			int m=s.nextInt();
			int a=numberOfPaths(n,m);
			System.out.print(a);
			s.close();

	    }
}