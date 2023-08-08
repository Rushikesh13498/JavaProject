package com.Basics;

import java.util.Scanner;

public class TempConversion {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter temperature in celsius:\n");
		
		float C = in.nextInt();
		
		float F = (C*9/5)+32;
		
		System.out.println("Temperature in fahrenheit is :"+ F);
		
		
		
		
	}
	
}