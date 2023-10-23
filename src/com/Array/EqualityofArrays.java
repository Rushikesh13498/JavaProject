package com.Array;

import java.util.Arrays;

public class EqualityofArrays {

	public void CompareLengthof2Arrays(int arr1[],int arr2[]) {
		
		System.out.println("..................................");
		System.out.println("Comparing length of two arrays:");
		
		/*
		 * for(int i=0;i<arr1.length;i++) { for(int j=0;j<arr2.length;j++) {
		 */
		
				if(arr1.length==arr2.length) {
					System.out.println("given two arrays are equal as the length of both two arrays is same");
					
				}else {
					System.out.println("given two arrays are not equal as the length of both two arrays is different");
				}
			}
			/*
			 * } }
			 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[]= {12, 22, 32, 42, 52, 62};
		int []arr2= {52, 22, 62, 12, 42, 22};

		
		System.out.println("arr1[]="+Arrays.toString(arr1));
		System.out.println("arr2[]="+Arrays.toString(arr2));
		
		EqualityofArrays e=new EqualityofArrays();
		e.CompareLengthof2Arrays(arr1, arr2);
	
	
	}
	
	

}
