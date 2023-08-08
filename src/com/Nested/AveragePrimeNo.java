package com.Nested;

public class AveragePrimeNo {
	
	public boolean checkPrime(int num) {
		boolean isprime = true;
		for (int i=2;i<num;i++) {
			if(num%i==0) {
				isprime=false;
				break;
			}
		}
		return isprime;
		
	}

	public static void main(String[] args) {
		
     AveragePrimeNo d=new AveragePrimeNo();
     int sum=0;
     int count=0;
     
     for (int n=1;n<=10;n++) {
    	 if(d.checkPrime(n)) {
    		 System.out.println(n);
    		 System.out.println("...................");
    		sum=sum+n;

    		count++;
    	
    	 } 
     }
	  float avg=sum/count;
	  System.out.println(avg);
     
     
	
	}
	

}
