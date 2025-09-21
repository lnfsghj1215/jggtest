package com.company.java_oop.l0415_anonymous_inner_class;

/*
* 匿名内部类的使用
* */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        //
        Outer outer01 = new Outer();
        outer01.m1();

        // 基于类的匿名内部类
        // 分析
        // 1、f1编译类型 Father
        // 2、f1的运行类型 AnonymousInnerClass$1
        /*
        * 类似：
        * class XXX extends Father{
        *   @Override
            public void test() {
                System.out.println("匿名内部类重写test方法");
        * }
        * */
        Father f1 = new Father("jack") {
            @Override
            public void test() {
                System.out.println("匿名内部类重写test方法");
            }
        };
        System.out.println("f1的运行类型" + f1.getClass());
        f1.test();

        // 基于抽象类的匿名内部类
        Animal dog = new Animal() {
            @Override
            void eat() {
                System.out.println("狗狗在吃...");
            }
        } ;
        dog.eat();
    }
}

class Outer {
    private int n1 = 10;
    public void m1(){
        // 基于接口的匿名内部类
        /*
        * 背景：
        * 1、需求：想使用IA接口，并创建对象
        * 2、传统方式：写一个类实现该接口，并创建对象
        * 3、希望实现的对象只使用一次，后面再也不使用
        * 4、可以使用匿名内部类来简化
        * 5、tiger的编译类型：IA
        * 6、tiger的运行类型：就是匿名内部类 XXX => Outer$1
        * */

        /*
        * class XXX implements IA {
        *  @Override
           public void cry() {
                System.out.println("老虎叫");
            }
        * }
        * */
        // 7、jdk底层在创建匿名内部类Outer$1后，立马创建了Outer$1的实例并返回给tiger
        // 8、匿名内部类使用一次，就不能再使用（tiger是实例对象，可以使用）
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎叫");
            }
        };
        System.out.println("tiger的运行类型=" + tiger.getClass());
        tiger.cry();



    }
}

interface IA {
    void cry();
}

class Father {
    private String name;
    public Father(String name) {
        this.name = name;
    } // 构造器
    public void test(){}
}

abstract class Animal { // 抽象类
    abstract void eat();
}