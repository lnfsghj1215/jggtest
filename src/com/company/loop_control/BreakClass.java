package com.company.loop_control;

public class BreakClass {
    public static void main(String[] args) {
        int count = 0;
        while (true){
            count++;
            int num = (int) (Math.random() * 100);
            System.out.println(num);
            if (num == 97){
                break;
            }
        }
        System.out.printf("一共生成了%d次", count);


    }
}
