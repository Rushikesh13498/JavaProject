package com.Array;

public class FindAverage {
	public static double average(double[] array,int size) {
		
		
		double sum=0,avg=0;
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
			avg=sum/size;

		}
        System.out.println("Average of given array is:"+avg);		
		return avg;
		
	}
public static int average(int[] array,int size) {
		
		int sum=0,avg=0;
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
			avg=sum/size;

		}
        System.out.println("average of given array is"+avg);		
		return avg;
		
				
	}
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,4,6,9,8};
		double arr1[]= {1,2,4,6,9,8};
		
		FindAverage f=new FindAverage();
		f.average(arr, 6);
	    f.average(arr1, 6);
		}

}
