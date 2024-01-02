package com.company.constructor;

public class Constructor01 {
    public static void main(String[] args) {
        PersonConstructor ps1 = new PersonConstructor("jack", 20);
        PersonConstructor ps2 = new PersonConstructor("tom");
        System.out.println(ps1.name + ps1.age);
        System.out.println(ps2.name + ps2.age);
    }
}

class PersonConstructor {
    String name;
    int age;

    // 构造器
    // 1、构造器没有返回值，也不能写void
    // 2、构造器的名称和类名PersonConstructor一样
    // 3、(String name, int age)是构造器形参列表，规则和成员方法一致
    // 4、构造器支持重载
    // 5、一旦定义了构造器，默认构造器PersonConstructor()就被覆盖了
    public PersonConstructor(String pname, int page) {
        System.out.println("构造器1被调用");
        name = pname;
        age = page;
    }
    public PersonConstructor(String pname) {
        System.out.println("构造器2被调用");
        name = pname;
    }
}