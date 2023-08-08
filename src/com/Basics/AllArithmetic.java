package com.Basics;

import java.util.Scanner;

public class AllArithmetic {
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);

        System.out.println("Enter two integer values:\n");

        int p = in.nextInt();
        int q = in.nextInt();
	
        int sum = p + q;
        int diff = p - q;
        int prod = p * q;
        int quotient = p / q;
        int remainder = p % q;

        // display the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}