package com.company.java_basic.loop_control;
import java.util.Scanner;

public class IfClass {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入分数");
        int score = myScanner.nextInt();
        if (score >= 90){
            System.out.println("你的成绩是A");
        }else if (score >= 80){
            System.out.println("你的成绩是B");
        }else if (score >= 70 ){
            System.out.println("你的成绩是C");
        }else if (score >= 60 ) {
            System.out.println("你的成绩是D");
        }else {
            System.out.println("不及格！");
        }
    }
}
