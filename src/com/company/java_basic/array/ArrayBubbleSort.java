package com.company.java_basic.array;

import java.util.Arrays;

public class ArrayBubbleSort {
    public static void main(String[] args) {
        int[] arr1 = {98, 33, 14, 75, 23, 8, 42, 11, 3, 23};
        int len = arr1.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                int temp;
                if (arr1[j] >= arr1[j + 1]) {
                    temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
