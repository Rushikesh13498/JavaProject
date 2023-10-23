package com.filehandling;
import java.util.*;
public class IOHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		
		System.out.println("age:"+age);
		System.err.println("age:"+age);
	}

}
