package com.abst1;

class Example6{
Example6()
{
	System.out.println("Animal is created");
}
}
class Tiger extends Example6
{
	Tiger(){
	super();
	System.out.println("Tiger is created");
	}
}
class Main
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Tiger z=new Tiger();
	}

}
