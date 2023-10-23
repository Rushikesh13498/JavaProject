package exceptionHandling;

public class TryandFinallyExample {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int div=a/b;
    	
    	
    	try {
            int result = div;
            System.out.println("Result: " + result);
        } finally {
            System.out.println("Finally block executed.");
        }
    }
    
  
}

