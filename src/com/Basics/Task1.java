package com.Basics;

	import java.util.Scanner;

	public class Task1 {
	    public static void main(String[] args) {
	    	Scanner in = new Scanner(System.in);

	        System.out.println("Enter two integer values:\n");

	        int p = in.nextInt();
	        int q = in.nextInt();
	        int r;

	        r = p + q;
	        System.out.println("\n\nResult: " + p + " + " + q + " = " + r);
	    }
	}