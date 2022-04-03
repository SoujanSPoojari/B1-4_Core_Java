package com.Looping_Assignment;

public class RightAngledPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n = 1;
		for(i=0;i<10;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print("@ ");
			}
			n=n+1;
			System.out.println();
		}
	}

}
