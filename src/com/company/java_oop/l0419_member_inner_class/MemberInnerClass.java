package com.company.java_oop.l0419_member_inner_class;

public class MemberInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.t1();
    }
}

class Outer {

    private int n1 = 10;
    public String name = "张三";

    class Inner {
        public void say() {
            System.out.println("n1=" + n1 + "," + "name=" + name);
        }
    }

    // 写方法
    public void t1() {
        // 使用成员内部类
        Inner inner = new Inner();
        inner.say();
        }
}