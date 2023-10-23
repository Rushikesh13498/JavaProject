package com.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DisplayTable {

	public void calculateTable(int arr[],int n) {
		int result=0;
		
		System.out.println("table of number given by user is:"+n);
	
		for(int i=1;i<=10;i++) {
			
			result =n*i;
		
			System.out.print(" "+result+" ");
			}
			
			
		}
		
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number you want to print the table of number: ");
     int n=sc.nextInt();

     DisplayTable d=new DisplayTable();
     d.calculateTable(null, n);
     
	}

}
