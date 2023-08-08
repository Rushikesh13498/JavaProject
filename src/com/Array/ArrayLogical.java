package com.Array;

import java.util.Scanner;

public class ArrayLogical {

	public void showOddElements(int []a) {
		
		for (int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
	}
	public void findMin(int a[]) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				
			
			min=a[i];
			}
		}
		System.out.println(min);
	}
	public void findSum(int a[]) {
		int sum=0;
		for(int x : a) {
			sum=sum+x;
		}
		System.out.println("sum= "+sum);
	}
	public void findMax(int a[]) {
		int max=a[0];
		for (int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("max= "+max);
	}

	
	
	
	public void DisplayEvenposition(int a[]) {
		
		int e=a[0];
		for(int i=0;i<a.length;i+=2) {
			System.out.println(a[i]+" ");
		}
		
		
		
		
	}
	public static void main(String[] args) {
		
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size");
         int size=sc.nextInt();
         int arr[]=new int[size];
         System.out.println("Enter the array elements");
	
	     for(int i=0;i<arr.length;i++) {
	    	 arr[i]=sc.nextInt();
	    	 }
	  ArrayLogical a=new ArrayLogical();
	  a.showOddElements(arr);
	  a.findMax(arr);
	  a.findSum(arr);
	  a.findMin(arr);
	  a.DisplayEvenposition(arr);
	}
	
	
	
}
