package com.strings;

import java.util.Scanner;

public class DhoniExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Dhoni";
		Scanner s= new Scanner(System.in);
		String str1= s.nextLine();
		if(str1.equals(str)) {
			System.out.println("Matching");	
		}
		else
		{
			System.out.println("Not Match");
		}
		s.close();
		//System.out.println(str.equals(str1));
	}

}
