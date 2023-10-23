package com.oops;

import java.util.Scanner;

public class ShoppingClass {
	
	double Price,rate;
	int choice;
   
  	 
     	   public double doTransaction(double Price) {
    		       this.Price=Price;
    			
    				double amount= rate*0.15;
    				Price=rate-amount;
    				System.out.println("you get flat 15% discount.your discounted price is:"+Price);
    		        return Price;
    		        
    	    }
    	
    	    public void doTransaction(int rate) {
    	    	this.rate=rate;
    	    	System.out.println("You don't get any discount.Final Price is:"+rate);
    	  
    	    }
   
    
	public static void main(String[] args) {
		ShoppingClass s1=new ShoppingClass();
		s1.doTransaction(500);
		s1.doTransaction(5000);
		
		
	

	}
}
