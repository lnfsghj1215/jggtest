package com.company.java_oop.l0395_final_02;

public class Final02 {
    public static void main(String[] args) {
        System.out.println(A.num); // 不会加载类，所以不会执行静态代码块

        // 包装类，String是final类型，不能被继承
        String s1 = "hi";
    }
}

class A {
    // final 和 static 往往搭配使用，效率更高；不会导致类加载，底层编译器做了优化处理！！！
    public final static int num = 1000;

    static {
        System.out.println("A的静态代码块被调用");
    }
}
