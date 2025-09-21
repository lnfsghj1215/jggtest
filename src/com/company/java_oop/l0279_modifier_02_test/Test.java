package com.company.java_oop.l0279_modifier_02_test;

import com.company.java_oop.l0279_modifier_02.A;
public class Test {
    public static void main(String[] args) {
        A a = new A();
        // 在不同包下，只能访问public修饰的属性或方法，不可以访问protected、默认和pricate修饰的属性或方法
        System.out.println(a.n1);
        // System.out.println(a.n2);
        // System.out.println(a.n3);
        // System.out.println(a.n4);
    }
}
