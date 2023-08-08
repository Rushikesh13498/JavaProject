package com.AbstractInterface;

interface Wired{
	public void feature();

}

interface Wireless{
     public void quality();
     }



public class Nestedinterface implements Wired,Wireless {

	public static void main(String[] args) {
		
		Nestedinterface n=new Nestedinterface();
		n.feature();
		n.quality();
	}


	@Override
	public void quality() {
		// TODO Auto-generated method stub
		System.out.println("this is wireless bluetooth connecting headphones");
	}

	@Override
	public void feature() {
		// TODO Auto-generated method stub
		System.out.println("this is wired headphones");
	}
}