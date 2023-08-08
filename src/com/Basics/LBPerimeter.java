package com.Basics;

import java.util.Scanner;

public class LBPerimeter {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter length and breadth of Rectangle:\n");
		
		int L = in.nextInt();
		int B = in.nextInt();
		
		int P = 2*(L+B);
		
		
		System.out.println("Perimeter of rectangle is :"+ P);
		
		
		
	}
	
}