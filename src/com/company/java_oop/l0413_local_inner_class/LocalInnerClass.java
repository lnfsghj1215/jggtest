package com.company.java_oop.l0413_local_inner_class;

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer outer01 = new Outer();
        outer01.m1();
    }
}

class Outer {
    private int n1 = 100;
    private void m2(){
        System.out.println("Outer m2()...");
    }
    public void m1() {
        // 1、局部内部类是定义在外部类的局部位置，通常在方法
        // 2、可以直接访问外部类的所有成员方法，包含私有的
        // 3、不能添加访问修饰符，但是可以使用final修饰
        // 4、作用于：仅仅在定义它的方法或代码块中
        // 5、局部内部类可以直接访问外部类的成员，比如n1
        // 6、外部类在方法中，可以创建Inner类的对象，然后调用即可
        // 7、外部其他类不能访问局部内部类
        // 8、如果外部类和局部内部类的成员重名时，默认遵循就近原则；如果想访问外部类的成员，可以使用（外部类.this.成员）去访问
        final class Inner01 { // 本质仍然是一个类
            //如果外部类和局部内部类的成员重名时，默认遵循就近原则；
            private int n1 = 800;

            // 可以直接访问外部类的所有成员方法，包含私有的
            public void f1() {
                System.out.println("n1=" + n1);
                // 哪个对象调用了m1，Outer.this就指向哪个对象
                // 如果想访问外部类的成员，可以使用（外部类.this.成员）去访问
                System.out.println("外部类的n1=" + Outer.this.n1);
                m2();
            }
        }
        // 6、外部类在方法中，可以创建Inner类的对象，让后调用方法即可
        Inner01 inner01 = new Inner01();
        inner01.f1();
    }
}