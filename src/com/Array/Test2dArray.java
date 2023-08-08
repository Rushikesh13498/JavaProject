package com.Array;

import java.util.Arrays;
import java.util.*;

public class Test2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mat[][];
		mat=new int[3][3];
		
		//or
		int arr [][]=new int [2][2];
		
		//or
		
		
		  int rows=4; int col=3;
		 
		
		int arr1[][]=new int [rows][col];
		
		//accessing 2d array
		
		System.out.println("....elements in 2d array........");
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
	
	
	//after inserting elements in 2d array
		arr[0][0]=52;
		arr[0][1]=96;
		arr[1][0]=82;
		arr[1][1]=94;	
	System.out.println(".........after inserting elements in 2d array");	
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		
		
		//using for loop
		System.out.println(".............using for loop..........");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println("Elements at arr["+i+"]["+j+"]="+arr[i][j]);
			}
		}
		
		//2d array
		
		
		
	}

}
;
