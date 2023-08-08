package com.Basics;

import java.util.Scanner;

public class AreaofEquiTriangle {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the length of side of equilateral triangle:\n");
		
		int a = in.nextInt();
		
		float A = (int) ((Math.sqrt(3)/4)*a*a);
		
		
		System.out.println("Area of Equilateral Triangle is :"+ A);
		
		
		
	}
	
}