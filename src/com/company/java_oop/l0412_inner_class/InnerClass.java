package com.company.java_oop.l0412_inner_class;

/*
* 类的五大成员：
* 1、属性
* 2、方法
* 3、构造器
* 4、代码块
* 5、内部类
* */
public class InnerClass { // 外部其他类
    public static void main(String[] args) {

    }
}

class Outer {
    private int n1 = 100; // 属性
    public void hi () { //方法
        System.out.println("hi");
    }

    public Outer(int n1) { // 构造器
        this.n1 = n1;
    }
    {
        System.out.println("代码块");
    }

    /*
     * 内部类分类：
     * 一、定义在外部类局部位置上（比如方法内）：
     * 1、局部内部类（有类名）
     * 2、匿名内部类（没有类名，重点！！！！！！）
     *
     * 二、定义在外部类的成员位置上：
     * 1、成员内部类（没有static修饰）
     * 2、静态内部类（使用static修饰）
     */

    class Inner { // 内部类（在Outer的内部）

    }
}