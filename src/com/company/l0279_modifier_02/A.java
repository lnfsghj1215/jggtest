package com.company.l0279_modifier_02;

public class A {
    // 四个属性，分别用不同的访问修饰符来修饰
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    //该方法可以访问四个属性
    public void m1(){
        // 在同一个类下，可以访问四种修饰符属性或方法
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
    }
}
