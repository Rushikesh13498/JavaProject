package com.Array;

import java.util.Arrays;

public class FindSpecific {

	public void FindNumbers(int []arr) {
		
		System.out.println("\n"+"finding specific numbers in the array:");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==65 ) {
				System.out.println("Array contains the specific number 65");
			}
		}
		for(int i=0;i<arr.length;i++) {
			if( arr[i]==77) {
				System.out.println("Array contains the specific number 77 at position");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {1,23,45,66,25,65,99,85,77};
      System.out.println(Arrays.toString(arr));
      
      FindSpecific f=new FindSpecific();
      f.FindNumbers(arr);
	}

}
