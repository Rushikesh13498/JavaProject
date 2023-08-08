package com.encapsulation;

import java.util.Scanner;

public class Logical {
	
	
public void FirstLastSum(int n) {
	int sum=0;
	
	int last=n%10;
	int first=0;
	
	while(n>0) {
		first=n%10;
		n=n/10;
	}
    System.out.println(first+" "+last);
System.out.println("sum of first digit and last digit is:"+(first+last));

}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		Logical l1=new Logical();
		l1.FirstLastSum(num);
		
	}

}
