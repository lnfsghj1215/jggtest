package com.company.array;

import java.util.Scanner;


public class ArraySearch {
    public static void main(String[] args) {
        int[] arr1 = {1, 8, 10, 89, 1000, 1234};
        Scanner myScanner = new Scanner(System.in);
        int num = myScanner.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == num) {
                flag = true;
                System.out.printf("%d存在，数组下标是%d", num, i);
                break;
            }
        }
        if (!flag) {
            System.out.printf("%d不存在数组中", num);
        }
    }
}

