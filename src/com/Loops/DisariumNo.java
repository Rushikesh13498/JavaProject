package com.Loops;

import  java.util.Scanner;

public class DisariumNo {
	
   public void checkNumber(int num)
   {
	   int count=0;
	   int temp=num;
	   while(num>0)
	   {
		   count++;
		   num=num/10;
	   }
	   System.out.println(count);
	   
	   num=temp;
	   int sum=0;
	   while(num>0) {
		   int digit=num%10;
		   
		   int power=1;
		   for(int i=1;i<=count;i++) {
			   power=power*digit;
			   
		   }
		   sum=sum+power;
		   count--;
		   num=num/10;
	   }
	     System.out.println(sum);
	    
   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Number");
	    
	    int n=sc.nextInt();
	    
	    DisariumNo d=new DisariumNo();
	    d.checkNumber(n);
    
	  
	  }
	}


