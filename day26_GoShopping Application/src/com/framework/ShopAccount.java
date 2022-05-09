package com.framework;

public abstract class ShopAccount {
	private int accNo;
	private String accNm;
	private float charges;
	
	public ShopAccount(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	public void bookProduct(float charges)
	{
		
	}
	public void items(float charges)
	{
		
	}
	@Override
	public String toString() {
		return String.format("ShopAccount [accNo=%s, accNm=%s, charges=%s]", accNo, accNm, charges);
	}
	
}
