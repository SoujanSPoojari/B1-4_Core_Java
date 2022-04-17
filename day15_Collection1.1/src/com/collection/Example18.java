package com.collection;

import java.util.ArrayList;

public class Example18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(111);
		list.add(222);
		list.add(333);
		list.add(444);
		list.add(555);
		list.add(666);
		System.out.println(list);
		list.set(1, 000);
		list.set(3, 000);
		System.out.println(list);

	}

}
