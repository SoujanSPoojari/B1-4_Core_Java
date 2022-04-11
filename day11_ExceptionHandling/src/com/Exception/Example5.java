package com.Exception;

import java.io.IOException;

public class Example5 {
	void myMethod(int num)throws IOException, ClassNotFoundException{
			if(num==1)
			throw new IOException("IOexception Occured");
			else
				throw new 
				ClassNotFoundException("ClassNotFoundException");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Example5 obj=new Example5();
			obj.Example5(1);
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		
	}

	public void Example5(int i) {
		// TODO Auto-generated method stub
		
	}

	public Example5(int i) {
		// TODO Auto-generated method stub
		
	}

	public Example5() {
		// TODO Auto-generated method stub
		
	}

}
