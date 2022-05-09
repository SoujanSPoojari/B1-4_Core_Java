package com.framework;

public abstract class NormalAccount extends ShopAccount{
	private static float deliveryCharge = 0;
	
	/**
	 * 
	 */
	public NormalAccount(int accNo,String accNm,float delivaryCharges,float charges) {
		
		super(accNo,accNm,charges);
		NormalAccount.deliveryCharge= delivaryCharges;
		// TODO Auto-generated constructor stub
	}
	public void bookProduct  (float deliveryCharges)
	{
		
	}
	@Override
	public String toString() {
		return String.format("NormalAccount [deliveryCharge=%s]", deliveryCharge);
	}
	
}
