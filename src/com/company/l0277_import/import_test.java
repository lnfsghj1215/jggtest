package com.company.l0277_import;

import java.lang.reflect.Array;
import java.util.Arrays;

public class import_test {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        Arrays.sort(arr);
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
