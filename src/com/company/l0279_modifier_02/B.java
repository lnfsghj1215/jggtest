package com.company.l0279_modifier_02;

public class B {
    public void say(){
        A a = new A();
        // 在同一个包下，可以访问public、protected和默认，不能访问private的属性或方法
        System.out.println(a.n1);
        System.out.println(a.n2);
        System.out.println(a.n3);
        // System.out.println(a.n4);
    }
}
