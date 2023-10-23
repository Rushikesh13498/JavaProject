package lab;

import java.util.Scanner;

public class ArrayMock {
	public void Smallest(int arr[]){
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
			
		}System.out.println("Smallest number in given array is:"+smallest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int arr[]= {5,6,8,15,26,36,5,4,2,8,9,6,33,6};
       
       ArrayMock a=new ArrayMock();
       a.Smallest(arr);
}
}