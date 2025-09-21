package com.company.java_basic.array;

public class TwoDimArray {
    public static void main(String[] args) {
        // 使用方式1：动态初始化
        //  int[][] a = new int[2][3];
        // 使用方式2：先声明，再初始化
        //  int[][] a;
        //  a = new int[2][3];
        // 使用方式3：列数不确定
        // 输出：
        // 1
        // 2 2
        // 3 3 3
        int[][] a = new int[3][]; // 列数为空
        for (int i = 0; i < a.length; i++){
            a[i] = new int[i+1];
            for (int j = 0; j < a[i].length; j++){
                a[i][j] = i + 1;
            }
            System.out.println();
        }
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        // 使用方式4：静态初始化
        int[][] arr1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};
        for (int[] e1 : arr1) {
            for (int e2 : e1) {
                System.out.print(e2 + " ");
            }
            System.out.print("\n");
        }

        /*
        * 1、一维数组声明方式：
        *   int[] x 或者 int x[]
        * 2、二维数组声明方式：
        *   int[][] y 或者 int[] y[] 或者 int y[][]
        * */
    }
}
