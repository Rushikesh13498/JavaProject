package com.Array;

import java.util.Scanner;
import java.util.Arrays;

public class ElementInsertion {
	

	public void InsertElement(int arr[],int idx,int n) {
		arr[idx]=n;
		System.out.println("Array after inserting element");
		for(int i=0;i<arr.length;i++) {
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,63,2,3,6,54,8,9,4};
		System.out.println(Arrays.toString(arr));
		
		Scanner sc=new Scanner(System.in);
		System.out.println("At what position you want to add:");
		int p=sc.nextInt();
		
		System.out.println("number you want to add at position"+p+":");
		int n=sc.nextInt();
		
		
		
	}

}
