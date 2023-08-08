package com.operators;

import java.util.Scanner;

public class FtoC {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter temperature in fahrenheit:\n");
		
		float F = in.nextInt();
		
		float C = (F-32)*5/9;
		
		System.out.println("Temperature in celcius is :"+ C);
		
		
		
		
	}
	
}