package MockPapersMarch;

public class Q5 {
	    public static void main(String[] args) {
	        int n = 5; // Number of times to print the series
	        int start = 2; // Initial value of the series

	        for (int i = 1; i <= n; i++) {
	            System.out.print(start + " ");
	            start = calculateNextValue(start);
	        }
	    }

	    public static int calculateNextValue(int previous) {
	        return previous + (previous * 4);
	    }
	}

