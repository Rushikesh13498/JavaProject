package mockPaperAugust;

import java.util.Scanner;

public class Q20 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an odd number: ");
	        int n = scanner.nextInt();

	        drawPattern(n);
	    }

	    public static void drawPattern(int n) {
	        int numCount = 1;
	        char charCount = 'A';

	        for (int i = n; i >= 1; i -= 2) {
	            for (int j = 1; j <= i; j++) {
	                if (i % 2 != 0) {
	                    if (j % 2 != 0) {
	                        System.out.print(numCount);
	                        numCount++;
	                    } else {
	                        System.out.print(charCount);
	                        charCount++;
	                    }
	                } else {
	                    if (j % 2 != 0) {
	                        System.out.print(charCount);
	                        charCount++;
	                    } else {
	                        System.out.print(numCount);
	                        numCount++;
	                    }
	                }
	            }
	            System.out.println();
	            charCount = 'A';
	            numCount = 1;
	        }
	        for (int i = 3; i <= n; i += 2) {
	            for (int j = 1; j <= i; j++) {
	                if (i % 2 != 0) {
	                    if (j % 2 != 0) {
	                        System.out.print(numCount);
	                        numCount++;
	                    } else {
	                        System.out.print(charCount);
	                        charCount++;
	                    }
	                } else {
	                    if (j % 2 != 0) {
	                        System.out.print(charCount);
	                        charCount++;
	                    } else {
	                        System.out.print(numCount);
	                        numCount++;
	                    }
	                }
	            }
	            System.out.println();
	            charCount = 'A';
	            numCount = 1;
	        }
	    }
	}

