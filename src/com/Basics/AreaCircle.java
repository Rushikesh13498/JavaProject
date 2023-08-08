package com.Basics;

import java.util.Scanner;

public class AreaCircle {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter radius of Circle:\n");
		
		int R = in.nextInt();
		
		int D = 2*(R);
		float C = (float) (2*3.14*R);
		float A = (float) (3.14*R*R);
		
		
		
		System.out.println("Diameter of Circle is :"+ D);
		System.out.println("Circumference of Circle is :"+ C);
		System.out.println("Area of Circle is :"+ A);
		
	}
	
}