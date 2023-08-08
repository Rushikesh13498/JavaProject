package com.Array;
 public class Sort{
public void ReverseArray (int [] arr){
	
   
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
           
        }

        System.out.println();
        System.out.println("Array in reverse order:\n ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    Sort s=new Sort();
    s.ReverseArray(arr);
}
}
