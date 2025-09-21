package com.company.java_oop.l328_debug;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Debug01 {
    public static void main(String[] args) {
        int[] arr = {1, -1, 10, -20, 100};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("退出for循环");
    }
}
