package com.company.loop_control;

import java.util.Scanner;
public class SwitchClass {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入字符");
        char c1 = myScanner.next().charAt(0);
        // switch (表达式) 中表达式的返回值必须是：byte、short、int、char、enum[枚举]、String
        // case子句中的值必须是常量，不能是变量
        switch (c1) {
            case 'a':
                System.out.println("星期一");
                break;
            case 'b':
                System.out.println("星期二");
                break;
            case 'c':
                System.out.println("星期三");
                break;
            default:
                System.out.println("你输入的字符不正确");
        }
        System.out.println("退出switch");
    }


}
