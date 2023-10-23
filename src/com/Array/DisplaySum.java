package com.Array;
import java.util.Scanner;
public class DisplaySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int arr[]=new int[3];
    int  sum=0;
   
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter no of elements");
    
	 int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		System.out.println("Enter the elements:");
		arr[i]=sc.nextInt();
		
	}
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
		
		
	}
	    System.out.println(sum);
	
	
	}

}
