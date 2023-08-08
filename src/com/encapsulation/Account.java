package com.encapsulation;

public class Account {
	private int acctno;
	private String type;
	private int balance;
	
	public void setAccountno(int acctno) {
		this.acctno=acctno;
	}

	public void setType(String type) {
		this.type=type;
	}
	
	public void setBalance(int balance) {
	if (balance>=1000) {
		this.balance=balance;
	}else {
		System.out.println("min balance required is 1000");
	}
		
		this.balance=balance;
	}
	public int getAccountno (){
		return acctno;
	}
	public String getType() {
		return type;
	}
	public int getBalance() {
		return balance;
	}
}
