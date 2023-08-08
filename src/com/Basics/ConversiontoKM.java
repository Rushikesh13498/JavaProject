package com.Basics;

import java.util.Scanner;

public class ConversiontoKM {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter length in centimeter:\n");
		
		int L = in.nextInt();
		
		float M = (L/100);
		
		float KM = (M/1000);
		
		System.out.println("converted length to Meter is :"+ M);
		System.out.println("converted length to  kilometer is:"+ KM);
		
		
		
		
	}
	
}