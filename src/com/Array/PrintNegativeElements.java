package com.Array;

import java.util.Arrays;

public class PrintNegativeElements {
	
	public void NegativeElementsonly(int arr[]) {
		
		System.out.println("Negative elements from an array is:");
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
		
				System.out.print(" "+arr[i]+" ");
                count++;		
			}
			
		}
		System.out.println("\n.....................");
		System.out.println("Total number of negative elements are:"+count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,3,2,5,-6,-9,-8,4,-98};
		System.out.println(Arrays.toString(arr));
		
		PrintNegativeElements p=new PrintNegativeElements();
		p.NegativeElementsonly(arr);
		
	}

}
