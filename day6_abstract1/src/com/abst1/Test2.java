//This sum is for testing
package com.abst1;

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
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal h=new Herbivorous();
		Animal c=new Carnivorous();
		h.eat();
		c.eat();
	}

}
