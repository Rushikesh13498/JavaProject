package com.Array;

import java.util.Arrays;

public class ReverseArray {

	public static void revers(int[] a) {
		// TODO Auto-generated method stub

		System.out.println(Arrays.toString(a));
	    int j=a.length-1;
	    
	    for(int i=0;i<a.length/2;i++) {
	    	
	    	int temp=a[i];
	    	a[i]=a[j];
	    	a[j]=temp;
	    	j--;
	    }
	    System.out.println(Arrays.toString(a));
	}
	public static void main(String[]args)
	{
		int arr[]= {6,2,5,3,4};
		
		ReverseArray.revers(arr);
	}
	
	
	
	
	
}
