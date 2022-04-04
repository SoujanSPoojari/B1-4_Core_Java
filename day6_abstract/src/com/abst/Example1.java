package com.abst;
abstract class Animal
{
	abstract void eat();
}
class Herbivorous extends Animal
{
	void eat()
	{
		System.out.println("I am Vegiee");
	}
}
class Carnivorous extends Animal
{
	void eat()
	{
		System.out.println("I am Non Vegiee");
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal h=new Herbivorous();
		Animal c=new Carnivorous();
		h.eat();
		c.eat();
	}

}
