package com.Array;

import java.util.Arrays;

public class ReplaceZero {
	
	public void ReplaceZerowithOne(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				arr[i]=1;
				
			}
			
		}System.out.print(Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {78,2,55,0,8,42,79,0,0,69,56};
     ReplaceZero r=new ReplaceZero ();
     r.ReplaceZerowithOne(arr);
     
		
		
	}

}
