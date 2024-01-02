package com.company.package_01;

// 不建议用*的方式导入
// import java.util.Scanner; //表示只引入java.util包下的Scanner
// import java.util.*; // 表示将java.util包下所有类都引入

import java.util.Arrays;

public class Import01 {
    public static void main(String[] args) {
        int[] arr1 = {3, -1, 0, 99, -100,32};
        Arrays.sort(arr1);
        for(int i: arr1){
            System.out.println(i);
        }
    }
}
