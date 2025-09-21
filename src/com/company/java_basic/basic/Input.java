package com.company.java_basic.basic;
import java.util.Scanner; // 表示把java.util下的Scanner类导入

public class Input {
    public static void main(String[] args) {
        // 接受用户的输入
        // 步骤
        // 1、引入Scanner类所在的包
        // 2、创建 Scanner对象实例
        // myScanner就是Scanner类的实例对象
        Scanner myScanner = new Scanner(System.in);
        // 3、接收用户输入，使用相关方法
        System.out.println("请输入名字");
        String name = myScanner.next();
        System.out.println("请输入年龄");
        int age = myScanner.nextInt();
        System.out.println("请输入薪水");
        double sal = myScanner.nextDouble();
        System.out.println("名字是" + name + "年龄是" + age + "薪水是" + sal);
    }

}
