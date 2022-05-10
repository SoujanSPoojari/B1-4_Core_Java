package com.framework;

public abstract class PrimeAccount extends ShopAccount {
	private static boolean isPrime;
	@SuppressWarnings("unused")
	private static final float deliveryCharges=0.0f;
	/**
	 * @param isPrime
	 */
	public PrimeAccount(int accNo,String accNm,float charges,boolean isPrime) {
		super(accNo,accNm,charges);
		//this.isPrime = isPrime;
		PrimeAccount.isPrime=isPrime;
	}
	public void bookProduct  (float Charges)
	{
		
	}
	@Override
	public String toString() {
		return String.format("PrimeAccount [isPrime=%s]", isPrime);
	}
	
}
