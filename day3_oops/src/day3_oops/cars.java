package day3_oops;
public class cars {
	String str;
	cars(String st)
	{
		str=st;
	}
	void display()
	{
		System.out.println(str);
	}
	public static void main(String[] args) {

		
		cars c=new cars("This is Audi");
		cars c1=new cars("This is BMW");
		cars c2=new cars("This is Benz");
		c.display();
		c1.display();
		c2.display();
		
	}

}
