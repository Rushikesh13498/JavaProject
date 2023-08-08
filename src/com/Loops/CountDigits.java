package com.Loops;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int count=0;
		System.out.print("Enter the number:");
		int n =in.nextInt();
	
	while(n>0) {
		n=n/10;
		count++;
	}
	System.out.println("number of digits in th entered integer are:"+count);
	
	
	}
	
	

}
