package com.Array;


import java.util.*;
public class TestArray2d {
	
	
	
	public static void main(String []args) {
		
		int tab[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int rows=sc.nextInt();
		System.out.println("Enter no of coloumns:");
		int cols=sc.nextInt();
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
		System.out.println("Enter elements for tab["+i+"]["+j+"]");
		 tab[i][j]=sc.nextInt();
		
			}
			}
		
		System.out.println("...2d array........");
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
		System.out.print(tab[i][j]+"\t");
		
			}
			System.out.println();
			}
		
	}

}
