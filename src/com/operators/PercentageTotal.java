package com.operators;

import java.util.Scanner;

public class PercentageTotal {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Marks of 5 subjects:\n");
		
		int sub1 = in.nextInt();
		int sub2 = in.nextInt();
		int sub3 = in.nextInt();
		int sub4 = in.nextInt();
		int sub5 = in.nextInt();
		
		int TotalMarks= (sub1 + sub2 + sub3 + sub4 + sub5);
		float Percentage = (TotalMarks / 500) * 100;
		int Average = TotalMarks/5;
		
		
		
		System.out.println("Total of 5 subject is :"+ TotalMarks);
		System.out.println("Average of 5 subject is :"+ Average);
		System.out.println("percentage of 5 subject is :"+ Percentage);
		
	}
	
}