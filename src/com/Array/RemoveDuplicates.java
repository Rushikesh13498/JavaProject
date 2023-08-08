package com.Array;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arrWithDuplicates = {4, 3, 2, 4, 9, 2};
        int[] arrWithoutDuplicates = new int[arrWithDuplicates.length];
        int count = 0;
        for (int i = 0; i < arrWithDuplicates.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (arrWithDuplicates[i] == arrWithoutDuplicates[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate
            		!=isDuplicate) {
                arrWithoutDuplicates[count++] = arrWithDuplicates[i];
            }
        }
        System.out.println("Array With Duplicates : " + Arrays.toString(arrWithDuplicates));
        System.out.println("Array Without Duplicates : " + Arrays.toString(Arrays.copyOf(arrWithoutDuplicates, count)));
    }
}

