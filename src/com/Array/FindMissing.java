package com.Array;

public class FindMissing {
	
	public static int findMissingnumber(int []arr,int n) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				
			min=arr[i];
			}
		}
		System.out.println("Smallest number from array:"+min);
	
	
	int max=arr[0];
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			
			max=arr[i];
		}
	}
	
	System.out.println("largest number of an array is:"+max);
	/*int missing=0;
	for(int i=0;i<=arr.length;i++) {
		for(int j=min;j<=max;j++) {
		if(arr[j+1]-arr[j]!=1) {
			missing=(arr[j]+1);
			System.out.println(missing);
		}
			
			
			
	}
	}
	}
*/
	
	int sum=((n+1)*(n+2))/2;
	for(int i=0;i<n;i++) {
		sum-=arr[i];
		return sum;
		
	}
	return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,5};
		int N=arr.length;
		
		//FindMissing f=new FindMissing();
		System.out.println(findMissingnumber(arr,N));
	}

}
