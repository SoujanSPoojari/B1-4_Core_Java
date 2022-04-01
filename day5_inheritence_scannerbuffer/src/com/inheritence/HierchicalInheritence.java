package com.inheritence;
class CellPhones
{
	void message()
	{
		System.out.println("Hi, Soujan");
	}
	void call()
	{
		System.out.println("I am calling Soujan");
	}
}
class SamsungGalaxym31 extends CellPhones
{
	void facelock()
	{
		System.out.println("Hi, FAcelock");
	}
}
class OnePlus extends CellPhones
{
	void games()
	{
		System.out.println("PUBG");
	}
}

public class HierchicalInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnePlus o=new OnePlus();
		o.games();
		o.message();
		o.call();
		SamsungGalaxym31 m=new SamsungGalaxym31();
		m.facelock();
	}

}
