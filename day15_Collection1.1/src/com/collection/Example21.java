package com.collection;

import java.util.LinkedList;

public class Example21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
				list. add (10);
				list.add (20);
				list.add (30);
				list. add (40);
				System.out.println (list);
				list. add (2, 9999);
				System.out.println (list);
				LinkedList<Integer> listl = new LinkedList<Integer>();
				listl.addFirst(111);
				listl.addFirst(222);
				listl.addFirst(333);
				System.out. println(list);
				list.addAll (3, listl);
				System.out.println (list);
	}

}
