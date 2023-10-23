package com.Array;

import java.util.Arrays;

public class SortedArray {
	
	public void DisplayNegativeFirst(int arr[]) {
		
		System.out.println("Displaying negative elements first after that diplaying positive numbers of an array: ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				System.out.print((arr[i]+" "));
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				System.out.print(arr[i]+" ");
	}
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {12,3,1,9,-9,2,-56,-8,19};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(".............................");
		
		SortedArray s=new SortedArray();
		s.DisplayNegativeFirst(arr);
		
	}

}
