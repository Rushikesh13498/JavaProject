package com.shopfactorydesgin;

public class Debitcard implements Payment{

	
	int balance=10000;
	@Override
	public void payment() {
		// TODO Auto-generated method stub
		int amount = 0;
		System.out.println("you are paying by debit card");
	if(balance<amount) {
		System.out.println("Insufficient Funds!!!");
	}
	
	}

}
