package com.Basics;

import java.util.Scanner;

public class CompoundInterest {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the principal amount:");
		int P = in.nextInt();
		
		System.out.println("Enter the Time Period:");
		int T = in.nextInt();
		
		System.out.println("Enter the Rate of Interest:");
		int R = in.nextInt();
		
		
	    double CI = P * Math.pow(1 + (R/100), T) - P;
		
	    System.out.println("Compound Interest is :"+ CI );
		
		
		
	}
	
}