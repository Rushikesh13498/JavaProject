package com.Basics;

import java.util.Scanner;

public class Squareroot{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("enter the number:");
		
		double num = input.nextDouble();
		
		double squareroot = Math.sqrt(num);
		
		System.out.println("The squareroot of given number is" + squareroot);
		
		
		
	}
	
}