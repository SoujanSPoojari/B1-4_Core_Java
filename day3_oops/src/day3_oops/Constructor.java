package day3_oops;

public class Constructor {

	String str;
	int a;
	Constructor(String st,int x)
	{
		str=st;
		a=x;
	}
	void display()
	{
		System.out.println(str+" "+a);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c=new Constructor("Soujan",55);
		c.display();
	}

}
