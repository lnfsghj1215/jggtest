package com.company.java_basic.class_object;

public class ClassMethodDetail {
    public static void main(String[] args) {
        A a = new A();
        a.sayOk();
        B b = new B();
        b.sayHello();
    }
}

class A {
    // 方法调用细节说明
    // 1、同一个类中的方法调用：直接调用即可。比如print(参数)
    // 案例演示：A类 sayOk调用print()
    public void print(int n) {
        System.out.println("print()方法被调用 n=" + n);
    }
    public void sayOk() {
        print(10);
        System.out.println("继续执行sayOk()----");
    }
}

class B {
    // 方法调用细节说明
    // 2、跨类中的方法A类调用B类方法：需要通过对象名调用。比如 对象名.方法名(参数);
    // 案例演示：B类 sayHello调用print()
    public void sayHello() {
        A a = new A();
        a.print(20);
        System.out.println("继续执行sayHello()----");
    }
}