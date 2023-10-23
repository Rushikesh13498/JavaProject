package com.Array;

import java.util.Scanner;

public class ArraySorting {

	public void DisplayEvenFirst(int arr[]) {
		
		int neweven[]=new int[arr.length];
		int newodd[]=new int[arr.length];
	System.out.println("Display even numbers of array first and after that displaying odd numbers:");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				neweven[i]=arr[i];
				System.out.println("new even array is:"+neweven[i]+" ");
			}
		
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				newodd[i]=arr[i];
				System.out.print(newodd[i]+" ");
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {1,2,3,4,5,6};
    
    ArraySorting s =new ArraySorting();
    s.DisplayEvenFirst(arr);
	}

}
