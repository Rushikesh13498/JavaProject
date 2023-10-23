package com.Array;

public class FindCommonbetween2Arrays {
	
	public void FindCommonin2Arrays(int arr1[],int arr2[]) {
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println("Common elements between two arrays is:"+" "+arr1[i]+" ");
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[]= {12, 23, 34, 67 ,78, 91, 56};
		int arr2[]= {39, 25, 15, 23, 55, 91, 66, 22};
		
		FindCommonbetween2Arrays f=new FindCommonbetween2Arrays();
		f.FindCommonin2Arrays(arr1, arr2);
	}

}
