package com.Array;

//initiate an array with elements and make cube of every element and stored it in new array
import java.util.Arrays;

public class ArrayDemo {

	public void CalculateCubeofArray(int arr[]) {
		
		System.out.println("Cube of given array is:");
       
		int []cubeArray=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
		cubeArray[i]=arr[i]*arr[i]*arr[i];
			
		}	System.out.println(Arrays.toString(cubeArray));	
		
	
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {1,2,3,6,5,4,8,10};
     
     System.out.println(Arrays.toString(arr));
     System.out.println("......................");
     
     ArrayDemo a=new ArrayDemo();
     a.CalculateCubeofArray(arr);
     
     
	}

}
