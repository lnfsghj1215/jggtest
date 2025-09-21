package com.company.java_oop.l0285_extend_04;

public class Extend01 {
    public static void main(String[] args) {
        /*
         * 继承：代码复用性
         * 基本语法：
         * class 子类 extends 父类 {}
         * 1、子类会自动拥有父类定义的属性和方法
         * 2、父类又叫超类、基类
         * 3、子类又叫派生类
         * */

        // 大学生实例
        Graduate g1 = new Graduate();
        g1.name = "大明";
        g1.age = 18;
        g1.setScore(90);
        g1.showInfo();

        // 小学生实例
        Pupil p1 = new Pupil();
        p1.name = "小明";
        p1.age = 8;
        p1.setScore(100);
        p1.showInfo();


    }

}


