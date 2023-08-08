package com.Loops;

import java.util.Scanner;

public class SpyNumber {

	
	public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int num = input.nextInt();
		        
		        int sum = 0, product = 1;
		        while (num > 0) {
		            int digit = num % 10;
		            sum += digit;
		            product *= digit;
		            num /= 10;
		        }
		        
		        if (sum == product) {
		            System.out.println("The number is a spy number.");
		        } else {
		            System.out.println("The number is not a spy number.");
		        }
		    }


	}


