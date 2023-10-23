package com.Array;

public class PrintPrimeNumbers {

	public void PrimeNumberorNot(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			
				if(arr[i]%2!=0) {
					System.out.println(arr[i]);
					break;
				
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[]= {1,2,6,3,5,9,4,7};
   PrintPrimeNumbers p=new PrintPrimeNumbers();
p.PrimeNumberorNot(arr);

}
}