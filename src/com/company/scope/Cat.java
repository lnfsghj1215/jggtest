package com.company.scope;

public class Cat {
    // 全局变量：也就是属性，作用域为整个类体，Cat类，cry、eat等方法使用属性
    // 属性在定义时，可以直接赋值
    int age = 10;

    // 全局变量（属性）可以不赋值，直接使用，因为有默认值；
    double weight;

    public void cry() {
        // 1、局部变量一般是只在成员方法中定义的变量
        // 2、n和name就是局部变量
        // 3、n和name的作用域在cry方法中
        // 局部变量必须赋值后，才能使用，因为没有默认值。
        int n = 10;

        // 细节：属性和局部变量可以重名，访问时遵循就近原则
        int age = 20;
        String name = "jack";
        System.out.println("在cry中使用属性age=" + age);
        System.out.println("在cry中使用属性weight=" + weight);
    }
}
