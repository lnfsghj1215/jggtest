package com.company.class_object;

public class Object1 {
    public static void main(String[] args) {
        // 1、定义一个类 Class
        class Cat {
            String name;
            int age;
            String color;
        }
        // 2、实例化对象
        Cat cat1 = new Cat();
        // 3、给对象赋值
        cat1.name = "小白";
        cat1.age = 3;
        cat1.color = "白色";
        Cat cat2 = new Cat();
        cat2.name = "小花";
        cat2.age = 2;
        cat2.color = "花色";

        System.out.println(cat1.name);
    }
}
