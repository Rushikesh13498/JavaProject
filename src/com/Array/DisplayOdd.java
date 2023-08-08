package com.Array;

import java.util.Scanner;

public class DisplayOdd {

	public void showOddElements(int []a) {
		int sum=0;
		for (int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				
				System.out.println(a[i]);
				
				sum+=a[i];
				
			}
			
		}System.out.println("sum= "+sum);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size");
         int size=sc.nextInt();
         int arr[]=new int[size];
         System.out.println("Enter the array elements");
	
	     for(int i=0;i<arr.length;i++) {
	    	 arr[i]=sc.nextInt();
	    	 }
	  DisplayOdd l=new DisplayOdd();
	  l.showOddElements(arr);
	  
	
	}

}
