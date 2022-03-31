package day3_oops;

public class cars {
	String str;
	int a;
	cars(String st, int x,int y,int z)
	{
		str=st;
		a=x;
	}
	void display()
	{
		System.out.println(str+" "+a);
	}
	public static void main(String[] args) {
		
		
		cars c=new cars("Welcome to Audi", 0, 0, 0);
		cars c1=new cars("Welcome to BMW", 0, 0, 0);
		cars c2=new cars("Welcome to Benz", 0, 0, 0);
		c.display();
		c1.display();
		c2.display();
		
	}

}
