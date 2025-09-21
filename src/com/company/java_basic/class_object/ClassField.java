package com.company.java_basic.class_object;

public class ClassField {
    public static void main(String[] args) {
        // 创建Person对象
        // p1是对象名(对象引用)
        // new Person() 创建的对象空间(数据)才是真正的对象
        Person p1 = new Person();
        System.out.println(p1.name + " " + p1.isPass);

    }
}
/*
 * 注意细节
 * 1、属性的定义语法同变量，示例： 访问修饰符 属性类型 属性名；
 *   访问修饰符：public、protected、默认(不写)、private
 * 2、属性类型可以为任意类型，包含基本类型或引用类型
 * 3、属性如果不复制，有默认值，规则和数组一致
 * */
/*
* java内存的结构分析
* 1、栈：一般存放基本数据类型(局部变量)
* 2、堆：存放对象(Cat cat，数组等)
* 3、方法区：常量池(常量，比如字符串)，类加载信息

* */
class Person {
    //定义四个属性
    int age;
    String name;
    double sal;
    boolean isPass;
}