package com.Array;

import java.util.Scanner;

public class ReverseDisplay {
     
	 public void Reverse(int arr[]){
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
		 }
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner (System.in);
	 System.out.println("Enter the size of array:");
	 int size=sc.nextInt();
	 
	 System.out.println("Enter the elements of array:");
	 int arr[]=new int[size];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	ReverseDisplay s=new ReverseDisplay();
	s.Reverse(arr);
	}

}
