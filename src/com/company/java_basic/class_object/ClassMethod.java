package com.company.java_basic.class_object;

import java.util.Scanner;

public class ClassMethod {
    public static void main(String[] args) {
        // 方法使用
        // 1、方法写好后，如果不调用，不会输出
        // 2、先创建对象，然后调用方法即可
        Person2 p1 = new Person2();
        p1.speak();
        int sum = p1.cal01(1000);
        System.out.println(sum);
        int sum2 = p1.cal02(100, 200);
        System.out.println(sum2);
    }
}
class Person2{
    String name;
    int age;
    // 方法(成员方法)
    // 1、public 表示方法是公开
    // 2、void 表示方法没有返回值
    // 3、speak() speak是方法名，()是形参列表
    // 4、{}方法体，要执行的代码
    public void speak(){
        System.out.println("我是一个好人");
    }
    // 1、(int num) 形参列表，表示当前有一个形参num，可以接受输入
    public int cal01(int num){
        int sum = 0;
        for (int i = 1; i <= num; i++){
            sum += i;
        }
        return sum;
    }
    // 1、public 表示方法是公开的
    // 2、int表示方法执行后，返回一个int值
    // 3、cal02方法名
    // 4、(int num1, int num2) 形参列表，2个形参，可以接受两个输入
    // 5、return 表示把值返回

    // ！！！方法里不能定义方法
    public int cal02(int num1, int num2){
        return (num1 + num2);
    }
}
