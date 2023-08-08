package com.Array;

public class DisplayColumns {
	
	public static void printColoumnwise(int arr[][]) {
		System.out.println("printing array columnwise::");
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
					System.out.println(arr[j][i]);
			}System.out.println("............");
		}
		
	}
	public static void findMinimumincolumn(int arr[][]) {
		System.out.println("Finding minimum:");
		for(int i=0;i<arr.length;i++) {
			int min=arr[0][0];
			for(int j=1;j<2;j++) {
				if(arr[i][j]<min) {
					min=arr[i][j];
				}
			}
			System.out.print(" "+min);
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[][]= {{1,4,7},{2,6,8}};
    printColoumnwise(arr);
    findMinimumincolumn(arr);
    
	}

}
