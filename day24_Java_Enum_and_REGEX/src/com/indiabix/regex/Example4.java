package com.indiabix.regex;

import java.util.Scanner;
//import java.util.regex.Pattern;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str="Global Academy Of Technology ECE \r\nSoujan \r\nHitesh";
		String[] res=str.split("\\r?\\n");
		//System.out.println(res);
		for(String i:res)
		{
			System.out.println(i);
		}
		s.close();
	}

}
