package com.company.java_oop.l0386_code_block_detail;

public class CodeDetail {
    public static void main(String[] args) {

        // 类被加载的情况
        // 1、创建实例对象时
        // new A();

        // 2、创造子类对象时实例时，父类叶会被加载
        // A a1 = new A();

        // 3、使用类的静态成员时（静态属性、静态方法）
        // System.out.println(Cat.n1);

        // 4、static代码块是在类加载时执行的，而且只会执行一次
        // D d1 = new D();
        // D d2 = new D();

        // 5、普通代码块，在创建实例对象时被隐式调用
        // 被创建一次，就会调用一次
        // 如果只是使用类的静态成员时，普通代码块不会执行
        System.out.println(D.n1);

        // 可以这样简单理解，普通代码块是构造期的补充
    }
}

class D {
    public static int n1 = 999;
    static {
        System.out.println("D的静态代码块被执行");
    }
    {
        System.out.println("我是普通代码块");
    }
}

class Animal {
    static {
        System.out.println("Animal的静态代码块被执行");
    }
}

class Cat extends Animal {
    public static int n1 = 999;
    static  {
        System.out.println("Cat的静态代码块被执行");
    }
}

class A extends B{

    // 静态代码块
    static {
        System.out.println("A的静态代码块被执行");
    }
}

class B {

    static {
        System.out.println("B的静态代码块被执行");
    }
}