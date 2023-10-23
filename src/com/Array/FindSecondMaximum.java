package com.Array;

public class FindSecondMaximum {
	
	public void DisplaySecondMax(int arr[]) {
		int max = arr[0];
		int smax=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				smax=max;
				max=arr[i];
			}
		}
		System.out.println("Second Maximum number from an array is="+smax);
		
	}
	public static void DisplaySecondMin(int arr[]) {
		int min = arr[0];
		int smin=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				smin=min;
				min=arr[i];
			}
		}
		System.out.println("Second Minimum number from an array is="+smin);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {20, 0, 31, 45, 100, 1, 105, 90};
	    int arr1[]= {-20, 0, -25, 15, 19, 37, 23};
		
		
		FindSecondMaximum m=new FindSecondMaximum();
		m.DisplaySecondMax(arr);
	m.DisplaySecondMin(arr1);
	
	}

}
