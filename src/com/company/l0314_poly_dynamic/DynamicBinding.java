package com.company.l0314_poly_dynamic;

public class DynamicBinding {
    public static void main(String[] args) {
        //a的编译类型A，运行类型B
        A a = new B();
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}

class A {
    public int i = 10;
    /*
    * java的动态绑定机制
    * 1、当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
    * 2、当调用对象属性时，没有动态绑定机制，哪里声明，哪里调用
    * */
    public int sum(){
        return getI() + 10;
    }

    public int sum1(){
        return i + 10;
    }

    public int getI() { //父类getI
        return i;
    }
}

class B extends A {
    public int i = 20;

//    public int sum() {
//        return i + 20;
//    }

//    public int sum1() {
//        return i + 10;
//    }

    public int getI() { //子类getI
        return i;
    }
}
