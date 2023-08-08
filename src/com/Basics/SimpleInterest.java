package com.Basics;

import java.util.Scanner;

public class SimpleInterest {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the principal amount:");
		int P = in.nextInt();
		
		System.out.println("Enter the Time Period:");
		int T = in.nextInt();
		
		System.out.println("Enter the Rate of Interest:");
		int R = in.nextInt();
		
		int A = (P*R*T)/100;
		
		System.out.println("Simple Interest is :"+ A );
		
		
		
	}
	
}