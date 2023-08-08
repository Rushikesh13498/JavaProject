package com.Array;

public class SeparateZeros {
    public static void main(String[] args) {
        int[] arr = {12, 0, 7, 0, 8, 0, 3};
        separateZeros(arr);
        System.out.println("Array after separating zeros to end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void separateZeros(int[] arr) {
        int nonzero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonzero++] = arr[i];
            }
        }
        while (nonzero < arr.length) {
            arr[nonzero++] = 0;
        }
    }
}

