package com.company.java_basic.loop_control;

public class WhileClass {
    public static void main(String[] args) {
        /*
        *   while (循环条件){
        *       循环体语句;
        *       循环变量迭代；
        *   }
        * */
        int i = 1;
        while ( i <= 10){
            System.out.printf("第%d次说你好\n", i);
            i ++;
        }

    }
}
