package com.Loops;

import java.util.Scanner;


public class PalindromeNo {

	public static void main(String[] args) {
		  int r,sum=0,temp;  
		  
		  Scanner in = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        
	        int num = in.nextInt();
	        
		  temp=num;    
		  while(num>0){    
		   r=num%10;  
		   sum=(sum*10)+r;    
		   num=num/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome"); 

	}

}
