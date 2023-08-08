package com.Basics;

import java.util.Scanner;

public class AreaRectangle {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter length and breadth of Rectangle:\n");
		
		int L = in.nextInt();
		int B = in.nextInt();
		
		int P = (L*B);
		
		
		System.out.println("Area of rectangle is :"+ P);
		
		
		
	}
	
}