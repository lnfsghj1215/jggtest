package com.company.modifier_02;

public class Modifier01 {
    public static void main(String[] args) {
        /*
        * java提供四种访问控制修饰符号，用于控制方法和属性（成员变量）的访问权限（范围）：
        * 1、公开级别：用public修饰，对外公开
        * 2、受保护级别：用protected修饰，对子类和同一个包中的类公开
        * 3、默认级别：没有修饰符，对同一个包的类公开
        * 4、私有级别：用private修饰，只有类本身可以访问，不对外公开
        * */
        A a = new A();
        a.m1();
        B b = new B();
        b.say();
    }
}
// !!! 只有public和默认可以修饰类class
// protected class C1{}
// private class C2{}
