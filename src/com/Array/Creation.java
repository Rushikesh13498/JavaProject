package com.Array;

import java.util.Scanner;

public class Creation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[]= {5,5,8,9};
         int []a=new int[5];
         Scanner sc=new Scanner(System.in);
         
         for (int i=0;i<arr.length;i++) {
        	 a[i]=sc.nextInt();
        	 }
         System.out.println("........................");
         
         for(int i=0;i<a.length;i++) {
        	 System.out.println(i+" "+a[i]);
         }
         System.out.println("................");
         
         for(int x:a) {
        	 System.out.println(x);
         }
	}

}
