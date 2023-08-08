package com.Basics;

import java.util.Scanner;

public class AreaTriangle {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Base and Height of Triangle:\n");
		
		int B = in.nextInt();
		int H = in.nextInt();
		
		int A = (B*H)*1/2;
		
		
		System.out.println("Area of Triangle is :"+ A);
		
		
		
	}
	
}