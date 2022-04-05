package com.this1;

public class Example3 {
	void print(Example3 e)
	{
		System.out.println("SSP Developer");
	}
	void display()
	{
		print(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example3 e=new Example3();
		e.display();
	}

}
