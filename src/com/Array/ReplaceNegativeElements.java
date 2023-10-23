package com.Array;

import java.util.Arrays;

public class ReplaceNegativeElements {
	
	public void PrintLeftElementsquare(int arr[]) {
		
		System.out.println("Array after replacing negative elements with square of left consecutive element:");
	          for(int i=0;i<arr.length;i++) {
	        	  if(arr[i]<0) {
	        		  arr[i]=arr[i-1]*arr[i-1];
	        		  
	        	  }
	          }System.out.print(Arrays.toString(arr));
	   
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {12, 3, -19, 29, 5, -61, 44, 7, -9};
		
		System.out.println(Arrays.toString(arr));
		
		ReplaceNegativeElements r=new ReplaceNegativeElements();
		r.PrintLeftElementsquare(arr);
		
		
	}

}
