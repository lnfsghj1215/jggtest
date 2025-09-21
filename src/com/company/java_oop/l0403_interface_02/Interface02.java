package com.company.java_oop.l0403_interface_02;

public class  Interface02 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.n1);
        a.hi();
    }
}

class A implements InterfaceA{
    @Override
    public void hi() {
        System.out.println("hi");
    }
}