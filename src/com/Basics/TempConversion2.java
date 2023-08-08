package com.Basics;

import java.util.Scanner;

public class TempConversion2 {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter temperature in fahrenheit:\n");
		
		float F = in.nextInt();
		
		float C = (F-32)*5/9;
		
    	System.out.println("Temperature in celcius is :"+ C);
		
		
		
		
	}
	
}