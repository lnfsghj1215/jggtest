package com.company.java_oop.l0398_abstract_class_02;

public class Abstract02 {
    public static void main(String[] args) {
        // 1、抽象类不可被实例化
        // 2、new A(); 会报错
        // 3、抽象类不一定要有抽象方法
        // 4、一旦类包含了abstract方法，则这个类必须声明为抽象类
        // 5、abstract只能修饰类和方法，不能修饰属性和其他
        // 6、抽象类可以由任意成员，【抽象类本质还是类】，比如：非抽象方法，构造器，静态属性等
        // 7、抽象方法不能有主体，即不能实现
        // 8、如果一个类集成了抽象类，则它必须实现抽象类的所有方法，除非它自己也声明为抽象类
        // 9、抽象方法不能用private、final和static来修饰，因为这些关键字和重写是相违背的
    }
}

abstract class A {

}

class B {
    // public abstract void hi(); 会报错，因为类不是抽象类
}

class C {
    // public abstract int n1 = 1; 会报错，abstract只能修饰类和方法
}

abstract class D {
    public int n1 = 10;
    public static String name = "jgg";
    public void hi() {
        System.out.println("hi");
    }
    public abstract void hello();
    public static void ok(){
        System.out.println("ok");
    }
}

abstract class E {
    public abstract void hi();
    public abstract void hi2();
}

class F extends E { // 必须实现继承的抽象类的所有抽象方法！！！

    @Override
    public void hi() {

    }

    @Override
    public void hi2() {

    }
}

abstract class G extends E { // 如果一个类集成了抽象类，则它必须实现抽象类的所有方法，除非它自己也声明为抽象类
}
