package com.company.java_oop.l0403_interface_02;

public interface InterfaceA {
    // 写属性
    public int n1 = 10;

    // 在接口中，抽象方法可以省略abstract关键字
    public void hi();

    // jdk8后，可以有默认实现方法，但是需要使用default关键字修饰！！！
    public default void ok(){
        System.out.println("ok...");
    }

    // jdk8后，可以有静态方法
    public static void smile(){
        System.out.println("smile...");
    }
}


