package com.september_01;

import java.util.Arrays;
import java.util.Scanner;

public class MystackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=0;
		int arr[] = new int[size];
		Mystack m = new Mystack();
		System.out.println("enter the size of array");
		Scanner sc=new Scanner(System.in);
		Mystack.size=sc.nextInt();
		int choice = 0;
		do {
			System.out.println("please choose one option from below");

			System.out.println("1.push ");
			System.out.println("2.pop ");
			System.out.println("3.isFull ");
			System.out.println("4.isEmpty");
			Scanner input = new Scanner(System.in);
			choice = input.nextInt();
			switch (choice) {

			case 1:
				
				System.out.println("Enter the element you want to add in array:");
				int element = sc.nextInt();
				for(int i=0;i<arr.length;i++) {
				m.stackPush(element);
				}
				System.out.println("Added in array");
				System.out.println(Arrays.toString(arr));
				break;
			case 2:
				m.stackPop();
				break;
			case 3:
				m.isFull();
				break;
			case 4:
				m.isEmpty();
				break;
			case 5:
				System.out.println("Thank you");
				break;
			}

		} while (choice != 5);
	}

}
