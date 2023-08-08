package MockPapersMarch;

public class Q15 {
	
	    public static void main(String[] args) {
	        int[][] matrix = {
	            {12, 34, 2, 4},
	            {2, 90, 11, 0},
	            {6, 19, 7, 9},
	            {66, 41, 22, 3}
	        };

	        int rows = matrix.length;
	        int cols = matrix[0].length;

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
	                    System.out.print(matrix[i][j] + "\t");
	                } else {
	                    System.out.print("\t");
	                }
	            }
	            System.out.println();
	        }
	    }
}

//O/P------->
//12	34	2	4	
//2			    0	
//6			    9	
//66	41	22	3	
