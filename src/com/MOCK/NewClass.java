package com.MOCK;

import java.util.Scanner;


public class NewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int i=sc.nextInt();
  
		int firstdigit=i;
		while(firstdigit>=10) {
			firstdigit =firstdigit/10;
		}
		int lastdigit=i%10;
		
		int sum=firstdigit+lastdigit;
		
		System.out.println("the sum of first number and last number given by user is:"+sum);
	}

}
