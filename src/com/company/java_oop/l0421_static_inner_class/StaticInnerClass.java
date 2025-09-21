package com.company.java_oop.l0421_static_inner_class;

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.m1();

        // 外部其他类使用静态内部类
        // 静态内部类可以通过类名直接访问
        Outer.Inner inner = new Outer.Inner();
        inner.say();

        Outer.getInnerClass().say();
    }
}

class Outer {
    private int n1 = 10;
    private static String name = "张三";

    // 静态内部类
    // 1、放在外部类的成员位置
    // 2、使用static修饰
    // 3、可以访问外部所有静态成员，但不能访问非静态成员
    // 4、可以添加任意访问修饰符，因为它就是一个成员
    // 5、作用域：同其他成员，为整个外部类
    static class Inner {
        public void say() {
            System.out.println(name);
        }
    }

    public void m1() {
        Inner inner = new Inner();
        inner.say();
    }

    public static Inner getInnerClass() {
        return new Inner();
    }
}