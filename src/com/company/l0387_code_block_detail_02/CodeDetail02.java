package com.company.l0387_code_block_detail_02;

public class CodeDetail02 {
    public static void main(String[] args) {
        A a = new A(10000);
    }
}

class A {
    /*
    * 调用顺序：
    * 1、调用静态代码块初始化和静态属性初始化（这两个优先级一样，谁在前面谁先执行）
    * 2、调用普通代码块初始化和普通属性初始化（这两个优先级一样，谁在前面谁先执行）
    * 3、调用构造器
    * */

    public A(int n2) {
        System.out.println("A的构造器被执行");
        this.n2 = n2;
    }

    // 静态属性初始化
    private static int n1 = getN1();

    // 静态代码块
    static {
        System.out.println("A的静态代码块被执行");
    }

    public static int getN1(){
        System.out.println("getN1()被调用");
        return 100;
    }
    // 普通属性初始化
    private int n2 = getN2();

    // 普通代码块
    {
        System.out.println("A的普通代码块被执行");
    }

    public int getN2(){
        System.out.println("getN2()被调用");
        return this.n2;
    }
}