package com.company.l0293_extend_theory;

public class ExtendTheory {
    public static void main(String[] args) {
        Son son =  new Son();
        // 1、首先看子类是否有该属性
        // 2、如果子类有这个属性，并且可以访问，则返回信息（不能访问则报错）；
        // 3、如果子类没有这个属性，看父类有没有这个属性
        // 4、如果父类没有则按（3）的规则，继续向上找父类，知道object
        System.out.println(son.name);
        System.out.println(son.getAge());
        System.out.println(son.hobby);
    }
}

class GrandPa {
    String name = "大头爷爷";
    String hobby = "旅游";
}

class Father extends GrandPa {
    String name = "大头爸爸";
    private int age = 39;

    public int getAge(){
        return age;
    }
}

class Son extends Father {
    String name = "大头儿子";
}