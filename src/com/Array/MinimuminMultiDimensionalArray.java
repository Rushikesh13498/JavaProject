
package com.Array;

public  class MinimuminMultiDimensionalArray {
	public static void displayMinimuminmultidArray(int arr[][]) {
		
		System.out.println("Minimum element in 2d array");
		for(int i=0;i<arr.length;i++) {
			int min=arr[i][0];
			for(int j=1;j<arr[0].length;j++) {
				if(arr[i][j]<min) {
					min=arr[i][j];
				}
			}
			System.out.print(" "+min);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][]={{22, 31, 9}, {12, 5, 16}, {34, 42, 2}}; 
		displayMinimuminmultidArray(arr);
	}

}
