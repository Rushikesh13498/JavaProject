package com.Array;

import java.util.Arrays;

public class RightRotationofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {5, 6, 23, 67, 39, 10, 2};
		
		int lastIndex=arr.length-1;
		int lastIndexvalue=arr[arr.length-1];
		
		for(int i=arr.length-2;i>=0;i--) {
			arr[lastIndex]=arr[i];
			lastIndex--;
			if(i==0);
			arr[i]=lastIndexvalue;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
