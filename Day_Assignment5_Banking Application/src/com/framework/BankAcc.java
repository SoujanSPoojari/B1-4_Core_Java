package com.framework;

public abstract class BankAcc {
	private int accNo;
	private String accNm;
	private float accBal;
	
	/**
	 * @param accNo
	 * @param accNm
	 * @param accBal
	 */
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	public void withdraw(float accBal)
	{
	
	}
	public void deposite(float accBal)
	{
		
	}
	@Override
	public String toString() {
		return String.format("BankAcc [accNo=%s, accNm=%s, accBal=%s]", accNo, accNm, accBal);
	}
	
}
