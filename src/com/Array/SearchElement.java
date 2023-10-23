package com.Array;

import java.util.Scanner;

public class SearchElement {

	public void Search(int arr[],int searchElement) {
		int position=-1;//-1 is because if user want element is already at oth position so we must have to take position -1 
		for(int i=0;i<arr.length;i++) {
			if(searchElement==arr[i]) {
				position=i;
				break;
			}
		}
		if(position!=-1) {
			System.out.println(searchElement+"is present at index : "+position);
		}else {
			System.out.println(searchElement+"is not present in given array...");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {23,45,63,52,6,7,88};
	int search;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number you want to search:");
	search=sc.nextInt();
	
	SearchElement s=new SearchElement();
	s.Search(arr, search);
	
	
	}

}
