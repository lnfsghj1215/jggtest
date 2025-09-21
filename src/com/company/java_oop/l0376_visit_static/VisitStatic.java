package com.company.java_oop.l0376_visit_static;

public class VisitStatic {
    public static void main(String[] args) {
        // 类名.类变量名
        // 类名是随着类的加载创建，所以即使没有创建对象实例也可以访问
        System.out.println(A.name);
        A a = new A();
        System.out.println(a.name);


    }
}

class A {
    // 类变量
    // 类变量的访问，必须遵守相关的访问权限
    public static String name = "jgg";
}
