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

		
		cars c=new cars("This is Audi", 0, 0, 0);
		cars c1=new cars("This is BMW", 0, 0, 0);
		cars c2=new cars("This is Benz", 0, 0, 0);
		c.display();
		c1.display();
		c2.display();
		
	}

}
