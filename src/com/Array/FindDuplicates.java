package com.Array;

import java.util.Arrays;

public class FindDuplicates {
	
	public void PrintDuplicates(int arr[]) {
		
		System.out.println("Duplicates elements from an array is:");
		
		for(int i=0;i<arr.length;i++) {
			int countduplicates=0;
			for(int j=i;j<arr.length-1;j++) {
				if(arr[i]!=arr[j]) {
					if(arr[i]!=arr[j+1]) {
					countduplicates++;
					continue;
					}
					
					System.out.println(arr[i]);
					
			}//inner
				
			
			}
			
			} 
	}
	
	public static void FindUnique(int arr[]) {
		
		System.out.println("...................................");
		System.out.println("Unique elements from an array is:");
		
		for(int i=0;i<arr.length;i++) {
			int countunique=0;
			for(int j=i;j<arr.length-1;j++) {
				if(arr[i]!=arr[j]) {
				 countunique++;
				}
				
			} /* System.out.println("number of unique element are:"+countunique); */
			System.out.println(arr[i]);
			
			}
			
		} 
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {3, 10, 90, 78, 56, 10, 78, 34, 61};
		System.out.println(Arrays.toString(arr));
		System.out.println("..........................");
		
		FindDuplicates d=new FindDuplicates();
		d.PrintDuplicates(arr);
		d.FindUnique(arr);
	}
	

}
