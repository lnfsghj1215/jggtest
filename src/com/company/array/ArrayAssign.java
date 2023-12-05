package com.company.array;

public class ArrayAssign {
    public static void main(String[] args) {
        // 1、基本数据类型赋值，赋值方式为值拷贝
        // 2、数组在默认情况下是引用传递，赋的值时地址，赋值方式为引用传递，传的是地址
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1; // 把arr1的地址赋值给arr2
        arr2[0] = 10;
        for (int e : arr1){
            System.out.println(e);
        }

    }
}
