package com.framework;

public abstract class SavingAcc extends BankAcc{
	private static boolean isSalary;
	@SuppressWarnings("unused")
	private static final float MINBAL=0.0f;	
	
	public SavingAcc(int accNo, String accNm, float accBal,boolean isSalary) {
		super(accNo,accNm,accBal);
		//this.isSalary = isSalary;
		SavingAcc.isSalary=isSalary;
	}
	public void withdraw (float isSalary)
	{
		
	}
	@Override
	public String toString() {
		return String.format("SavingAcc [isSalary=%s]", isSalary);
	}
		
}
