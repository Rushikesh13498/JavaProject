package com.shopfactorydesgin;

public class Creditcard implements Payment   {

	int balance=10000;
	
	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("you are paying by credit card");
		
		
	}

}
