package MockPapersMarch;

public class Q3 {
	
	    public static void main(String[] args) {
	        int n = 5;
	        printNumbers(n);
	    }

	    public static void printNumbers(int n) {
	        if (n > 0) {
	            printNumbers(n - 1);
	            System.out.println(n);
	        }
	    }
	}


//O/P--------->
//1
//2
//3
//4
//5

