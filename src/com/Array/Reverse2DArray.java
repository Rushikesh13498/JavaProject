package com.Array;

import java.util.Arrays;

public class Reverse2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        int[][] arrCopy = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arrCopy[i][j] = arr[i][arr[0].length - j - 1];
            }
        }
        System.out.println("Original Array: " + Arrays. deepToString(arr));
        System.out.println("Array with reversed elements in each row: " + Arrays.deepToString(arrCopy));
    }
}

