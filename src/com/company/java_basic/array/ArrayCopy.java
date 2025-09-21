package com.company.java_basic.array;

public class ArrayCopy {
    public static void main(String[] args) {
        // 将 int[] arr1拷贝到arr2数组
        int[] arr1 = {10, 20, 30};
        int[] arr2 = new int[arr1.length]; // new表示开启新的内存空间
        // 遍历arr1，拷贝到arr2对应位置
        for (int i = 0; i < arr1.length; i++){
            arr2[i] = arr1[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
