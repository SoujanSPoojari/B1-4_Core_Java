package com.array;

public class Students_Marks {

	public String name;
	public String roll_no;
	void display()
	{
		
	}

	public Students_Marks(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students_Marks[] arr;
		arr = new Students_Marks[30];
		arr[0] = new Students_Marks(1,"appu");
		arr[1] = new Students_Marks(2,"abhishek");
		arr[2] = new Students_Marks(3,"Shankar");
		arr[3] = new Students_Marks(4,"Maurya");
		arr[4] = new Students_Marks(5,"Akash");
		arr[5] = new Students_Marks(6,"Basava");
		arr[6] = new Students_Marks(7,"Ajay");
		arr[7] = new Students_Marks(8,"Shivraj Aras");
		arr[8] = new Students_Marks(9,"Akash");
		arr[9] = new Students_Marks(10,"Shivu");
		arr[10] = new Students_Marks(11,"Vamshi");
		arr[11] = new Students_Marks(12,"Raaj");
		arr[12] = new Students_Marks(13,"Raam");
		arr[13] = new Students_Marks(14,"Pruthvi Kumar");
		arr[14] = new Students_Marks(15,"Jakie");
		arr[15] = new Students_Marks(16,"Prabhu");
		arr[16] = new Students_Marks(17,"Param");
		arr[17] = new Students_Marks(18,"Ravi");
		arr[18] = new Students_Marks(19,"Kumar");
		arr[19] = new Students_Marks(20,"Vicky");
		arr[20] = new Students_Marks(21,"Bharat");
		arr[21] = new Students_Marks(22,"Puneeth");
		arr[22] = new Students_Marks(23,"Vikram");
		arr[23] = new Students_Marks(24,"Lohith");
		arr[24] = new Students_Marks(25,"Surya");
		arr[25] = new Students_Marks(26,"Siddharth");
		arr[26] = new Students_Marks(27,"Viraj");
		arr[27] = new Students_Marks(28,"Gagan");
		arr[28] = new Students_Marks(29,"Yuvaraj");
		arr[29] = new Students_Marks(30,"Santhosh");
		for (int i=0;i<arr.length;i++)
		System.out.println("Element at "+i+":"+
		arr[i].roll_no+""+arr[i].name);
		
	}

}
