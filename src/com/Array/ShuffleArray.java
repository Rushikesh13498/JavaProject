package com.Array;

import java.util.Arrays;

public class ShuffleArray {
	
	public static void shuffleArray(int[] arr) {
          int lastIndex=arr.length-1;
          int firstIndexvalue=arr[0];
		for(int i=1;i<arr.length;i++) {
		
		 if(i==arr.length) {
			 arr[lastIndex]=firstIndexvalue;
			 
		 }
		 System.out.print(" "+arr[i]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {5, 6, 23, 67, 39, 10, 2};
		shuffleArray(arr);
	}

}
