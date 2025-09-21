package com.company.java_oop.l0392_single_instance_02;

public class SingleTon02 {
    public static void main(String[] args) {
        // 懒汉式的单例模式
        System.out.println(Cat.n1); // 此时构造器不会被调用
        Cat c1 =  Cat.getInstance();
        System.out.println(c1);
        Cat c2 =  Cat.getInstance();
        System.out.println(c2);
    }
}



// 希望在程序运行过程中，只能创建一个Cat对象（单例）

class Cat {
    private String name;

    public static int n1 = 999;

    private static Cat cat;
    // 步骤
    // 1、构造器私有化
    // 2、定义一个静态属性对象
    // 3、提供一个public的static方法，可以返回一个Cat对象
    // 4、只有用户使用getInstance时，才会返回cat对象，后续再用时返回同一个对象，实现单例
    private Cat(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }

    public static Cat getInstance() {
        if (cat == null) {
            cat = new Cat("大黄");
        }
        return cat;
    }

    @Override
    public String toString() {
        return super.toString() + name;
    }
}