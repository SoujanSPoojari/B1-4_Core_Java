package com.multithreading;
class Example9 {
	synchronized void printTable(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(400);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class Thread1 extends Thread
{
	Example9 t;
	Thread1(Example9 t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}
class Thread2 extends Thread{
	Example9 t;
	Thread2(Example9 t){
		this.t=t;
	}
	public void run()
	{
		t.printTable(100);
	}
}
	class Main
	{
	public static void main(String args[])
		{
			Example9 obj=new Example9();
			Thread1 t1=new Thread1(obj);
			Thread1 t2=new Thread1(obj);
			t1.start();
			t2.start();
		}
	}