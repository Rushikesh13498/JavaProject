package com.Array;

import java.util.Arrays;

public class FindMinMax {
	public void findMin(int a[]) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				
			
			min=a[i];
			}
		}
		System.out.println("Min="+min);
	}
	public void findMax(int a[]) {
		int max=a[0];
		for (int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("max= "+max);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr[]= {1,2,3,6,4,5,6,9};
  FindMinMax m=new FindMinMax();
  System.out.println(Arrays.toString(arr));
  
  System.out.println("..........................");
  System.out.println("Maximum number present in the array is:");
  m.findMax(arr);
  
  System.out.println("..........................");
  System.out.println("Minimum number present in the array is:");
  m.findMin(arr);
	}

}
