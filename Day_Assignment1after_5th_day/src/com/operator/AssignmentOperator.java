package com.operator;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		a*=b;
		System.out.println(a);
		s.close();
	}

}
