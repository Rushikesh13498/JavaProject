package com.Basics;

import java.util.Scanner;

public class Findthirdangle {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter two angles of Triangle:\n");
		
		float A1 = in.nextInt();
		float A2 = in.nextInt();
		
		float A3 = (180-(A1+A2)); 
		
		
		System.out.println("Third angle of Triangle is :"+ A3 + "degrees");
		
		
		
	}
	
}