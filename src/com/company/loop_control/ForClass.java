package com.company.loop_control;

public class ForClass {
    public static void main(String[] args) {
        /*
         * for (循环变量初始化;循环条件;循环变量迭代){
         *       循环操作
         *   }
         *
         * */
        // 两个循环变量
        int count = 3;
        for (int i = 0, j = 0; i < count; i++, j = j + 2) {
            System.out.println("i = " + i + "\nj = " + j);
        }
        // 统计100以内9的倍数，打印个数和求和
        int count2 = 0, sum = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 9 == 0){
                count2 ++;
                sum = sum + i;
            }
        }
        System.out.println("数量是：" + count2 + "\n总和是：" + sum);
        // 打印下列表达式输出
        for (int i = 0, j = 5; i <= 5; i++, j--){
            System.out.println(i + "+" + j + "=" + "5");

        }
    }

}
