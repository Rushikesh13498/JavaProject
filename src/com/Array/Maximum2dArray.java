package com.Array;

public class Maximum2dArray {
	
	public static void displaymaxin2dArray(int arr[][]) {
		System.out.println("Maximum element in 2d array");
		for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];
            for (int j = 1; j < arr[0].length; j++) {
             
            	if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            	
            }
            System.out.print(" "+max);
           
           
        }
		 System.out.println();
	}
	
	public static void displayMinimumin2dArray(int arr[][]) {
		System.out.println("..........................");
		System.out.println("Minimum element in 2d array");
		for(int i=0;i<arr.length;i++) {
			int min=arr[i][0];
			for(int j=1;j<arr[0].length;j++) {
				if(arr[i][j]<min) {
					min=arr[i][j];
				}
			}
			System.out.print(" "+min);
		}
		
		
	}

	    public static void main(String[] args) {
	        int[][] arr = {{22, 31, 9}, {12, 25, 16}};
	        
	        displaymaxin2dArray(arr);
	        displayMinimumin2dArray(arr);
	    }
	}


