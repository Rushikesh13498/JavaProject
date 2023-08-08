package com.Loops;

import java.util.Scanner;

public class TrimorphicNo {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = input.nextInt();
	        
	        int cube=num*num*num;
	        System.out.println("given number is:"+num);
	        
	        int lastDigit = cube % 10;
	        System.out.println("lastdigit of given cube is:"+lastDigit);
	        
	        if(num != lastDigit)
	        {
	        	System.out.println("the given number is not Trimorphic Number");
	        } else {
	        	System.out.println("The given number is Trimorphic Number");
	        }

	}

}
