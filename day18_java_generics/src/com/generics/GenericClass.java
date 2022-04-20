package com.generics;

public class GenericClass<I> {
	I val;	
	public static void main(String[] args) {
		
		GenericClass<Character>obj=new GenericClass<>();
		obj.val='z';
		obj.println("");
	}
	public void println(String string) {
		// TODO Auto-generated method stub
		
	}

}
