package com.company.java_oop.l0406_interface_detail;

public class InterfaceDetail {
    public static void main(String[] args) {
        // 证明接口中的属性，只能是public static final
        // static
        System.out.println(IA.n1);
        // final
        // IA.n1 = 30;

    }
}

interface IA {
    // 接口中的属性，只能是public static final
    int n1 = 1; // 实际上是 public static final int a =1;
    void hi();
}

interface IB {
    void say();
}

class Pig implements IA, IB {
    @Override
    public void hi() {

    }

    @Override
    public void say() {

    }
}