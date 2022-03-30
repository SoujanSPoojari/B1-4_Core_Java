package day3_oops;

public class Nonparametarize {

	String str;
	int a;
	Nonparametarize()
	{
		str="Soujan";
		a=11;
	}
	void display()
	{
		System.out.println(str+" "+a);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nonparametarize c=new Nonparametarize();
		c.display();
	}

}
