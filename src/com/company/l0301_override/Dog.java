package com.company.l0301_override;

public class Dog extends Animal {
    // 1、Dog时Animal子类
    // 2、Dog的cry方法和Animal的cry定义形式一样（名称，返回类型，参数）
    // 3、这时候我们就说Dog的cry方法，重写了Animal的cry方法
    public void cry() {
        System.out.println("小狗叫...");
    }

    public String m1(){
        return null;
    }
    // object不是 String的子类，编译错误
//    public Object m2() {
//        return null;
//    }
}
