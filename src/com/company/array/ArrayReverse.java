package com.company.array;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33, 44, 55, 66};
        /*
        for (int i = 0; i < (arr1.length) / 2; i ++ ){
            int temp;
            temp = arr1[i];
            arr1[i] = arr1[arr1.length - 1 - i];
            arr1[arr1.length - 1 - i] = temp;
        }
         */
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i ++){
            arr2[arr1.length - 1 - i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
