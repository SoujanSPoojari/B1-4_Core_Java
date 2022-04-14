package com.strings;
import java.util.StringTokenizer;
public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st3 = new StringTokenizer("Java:CodeString", ":",true);
		while(st3.hasMoreTokens())
		System.out.println(st3.nextToken());
	
	}

}
