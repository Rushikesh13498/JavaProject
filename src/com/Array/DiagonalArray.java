package com.Array;

public class DiagonalArray {

	public static void displayDiagonalArray(int arr[][]) {
		
		for(int i=0;i<arr.length;i++) {
		  System.out.println(arr[i][i]);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[][]= {{1,2,6},
		         {3,8,9},
		         {4,56,7}};
   
   displayDiagonalArray(arr);
	}

}
