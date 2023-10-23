package exceptionHandling;

public class Task9 {

	    public static void main(String[] args) {
	     
	        try {
	            String str = null;
	            int length = str.length(); 
	            System.out.println("Length: " + length);
	        } catch (NullPointerException e) {
	            System.out.println("Caught a NullPointerException: " + e.getMessage());
	        }

	        
	        try {
	            int[] numbers = null;
	            int value = numbers[0]; 
	            System.out.println("Value: " + value);
	        } catch (NullPointerException e) {
	            System.out.println("Caught a NullPointerException: " + e.getMessage());
	        }

	       
	        try {
	            String s = null;
	            boolean isEmpty = s.isEmpty(); 
	            System.out.println("Is empty: " + isEmpty);
	        } catch (NullPointerException e) {
	            System.out.println("Caught a NullPointerException: " + e.getMessage());
	        }
	    }
	}



