package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Example16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("java");
		list.add("J2EE");
		list.add("JSP");
		list.add("JAVA");
		list.add("SERVLETS");
		list.add("JAVA");
		System.out.println(list);
		System.out.println(list.indexOf("JAVA"));
		System.out.println(list.lastIndexOf("JAVA"));
	}

}
