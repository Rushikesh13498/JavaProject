package com.Basics;

import java.util.Scanner;

public class ConvertYears {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Number of Days:\n");
		
		int days = in.nextInt();
		
	    int years = days / 365;
	    int weeks = (days%365)/7;
	    int remainingdays = (days%365)%7; 
		
		System.out.println(+ years);
		System.out.println (+ weeks);
		System.out.println (+ remainingdays);
		
		
		
		
	}
	
}