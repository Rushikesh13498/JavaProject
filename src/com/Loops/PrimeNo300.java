package com.Loops;

public class PrimeNo300 {

	public boolean main(int num) {
		
		
		boolean isprime=true;
		for (int i=400;i>=300;i--) {
			if(num%i==0) {
				isprime=false;
				break;
			}
			}return isprime;
	}
			public static void main(String[]args) {
				
			PrimeNo300 p=new PrimeNo300();
			System.out.println(p);
				
				
			
		}

	}


