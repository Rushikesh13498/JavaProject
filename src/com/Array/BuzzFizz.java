package com.Array;

public class BuzzFizz {
	
	    public static void main(String[] args) {
	        int buzzCount = 0, fizzCount = 0, buzzFizzCount = 0;
	        for (int i = 1; i <= 50; i++) {
	            if (i % 3 == 0 && i % 5 == 0) {
	                System.out.println("buzzfizz");
	                buzzFizzCount++;
	            } else if (i % 
	            		3 == 0) {
	                System.out.println("buzz");
	                buzzCount++;
	            } else if (i % 5 == 0) {
	                System.out.println("fizz");
	                fizzCount++;
	            } else {
	                System.out.println(i);
	            }
	        }
	        System.out.println("Buzz printed " + buzzCount + " times.");
	        System.out.println("Fizz printed " + fizzCount + " times.");
	        System.out.println("BuzzFizz printed " + buzzFizzCount + " times.");
	    }
	}

	

