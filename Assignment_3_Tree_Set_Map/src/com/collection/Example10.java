package com.collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String>q=new LinkedList<>();
		q.offer("one");
		q.offer("two");
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
	}

}
