package com.interface1;
interface Example3 {
	void myMethod();
}
interface Example31 {
	void myOtherMethod();
}
class Soujan implements Example3,Example31 {
	public void myMethod() {
		System.out.println("FirstInterface");
	}
	public void myOtherMethod() {
		System.out.println("SecondInterface");
	}
}
class Main123
	{
	public static void main(String[] args) {
		Soujan myObj = new Soujan();
		myObj.myMethod();
		myObj.myOtherMethod();
		
	}
}