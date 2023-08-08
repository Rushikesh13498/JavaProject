package com.Loops;

public class OddNumbers {
	
	    public static void main(String[] args) {
	      
	    	int count=0;
	    	for (int i =0;i<=20;i++) {
	    		if (i%2!=0) {
	    			count++;
	    		}
	    	}
	    	System.out.println("Number of odd numbers between 1 to 20 :"+count);
	    }
}