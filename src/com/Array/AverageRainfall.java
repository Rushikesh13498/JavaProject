package com.Array;

import java.util.Scanner;

public class AverageRainfall {
	int size;

	void Average(double arr[]) {
		 double sum=0;
		for (int i=0;i<arr.length;i++) {
			sum+=arr[i];
			double A=sum/size;
		}
		System.out.println(sum);
	   
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size of array");
     int size=sc.nextInt();

     double[] arr=new double[size];
     System.out.println("Enter the rainfall values");
    
     
     
     for (int i=0;i<arr.length;i++) {
    	 arr[i]=sc.nextDouble();
    	 }
	
	AverageRainfall r=new AverageRainfall();
	r.Average(arr);
	}
}
