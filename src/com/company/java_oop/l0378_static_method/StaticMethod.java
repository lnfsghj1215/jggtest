package com.company.java_oop.l0378_static_method;

public class StaticMethod {
    public static void main(String[] args) {
        Student s1 = new Student("tom");
        s1.payFee(1000);

        Student s2 = new Student("marry");
        s2.payFee(1200);

        // 输出当前收到的总学费
        Student.showFee();

    }
}

class Student {
    private String name; // 普通变量

    // 定义一个静态变量，来累计学生的学费
    private static double fee = 0;

    public Student(String name) {
        this.name = name;
    }

    // 说明
    // 1、当方法使用static修饰后，该方法就是静态方法
    // 2、静态方法就可以访问静态属性/变量
    public void payFee(double fee) {
        Student.fee += fee;
    }

    // 普通方法。可以访问非静态成员，也可以访问静态成员
    public static void showFee(){
        System.out.println("总学费有：" + Student.fee);
    }

    // 类方法（静态方法）中。只能访问静态变量或静态方法
    // 不能使用this，super
    public static void hello(){
        //System.out.println(name);
        //System.out.println(this.name);
        //payFee();
        showFee();
    }
}