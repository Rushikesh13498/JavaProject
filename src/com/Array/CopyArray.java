package com.Array;

import java.util.Arrays;

public class CopyArray {
	
	public void PrintCopyArray(int arr[]) {
		int copiedarr[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			copiedarr[i]=arr[i];
			
		}
		System.out.println("Copied Array is:"+Arrays.toString(copiedarr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int arr[]= {1,2,5,6,9,8,33,4,65,458,88};
		
		System.out.println("original array is:"+Arrays.toString(arr));
		System.out.println("..............................");
		
		CopyArray c=new CopyArray();
		c.PrintCopyArray(arr);
		
	}

}
