package com.company.java_oop.l0388_code_block_detail_03;

public class BlockDetail03 {
    public static void main(String[] args) {
        new B();
    }
}

class A {
    {
        System.out.println("A的普通代码块");
    }

    public A() {
        // 这里有隐藏的执行
        // 1、super();
        // 2、调用本类的普通代码块
        System.out.println("A的构造器被调用");
    }
}

class B extends A{
    {
        System.out.println("B的普通代码块");
    }
    public B() {
        System.out.println("B的构造器被调用");
    }
}
