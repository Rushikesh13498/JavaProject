package mockPaperAugust;

import java.util.Scanner;

public class Q22 {
	
	    public static void main(String[] args) {
	        try {
	        	System.out.println("Enter the number:");
	        	Scanner n1=new Scanner(System.in);
	            int number = n1.nextInt(); 
	            checkBinary(number);
	            System.out.println("The number is a valid binary number.");
	        } 
	        catch (InvalidBinaryNumberException e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    public static void checkBinary(int number) throws InvalidBinaryNumberException {
	        String strNumber = String.valueOf(number);

	        for (char digit : strNumber.toCharArray()) {
	            if (digit != '0' && digit != '1') {
	                throw new InvalidBinaryNumberException("Invalid binary number: " + number);
	            }
	        }
	    }
	}

	class InvalidBinaryNumberException extends Exception {
	    public InvalidBinaryNumberException(String message) {
	        super(message);
	    }
	}


