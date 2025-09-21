package com.company.java_oop.l0393_final;

public class Final01 {
    public static void main(String[] args) {

    }
}

// 如果我们要求A类不能被其他类集成，可以使用final修饰A类
final class A {}

// class B extends A {}


class C {
    // 如果我们要求hi()不能被子类重写，可以使用final修饰
    final public void hi() {}
}

class D extends C {
//    @Override
//    public void hi() {
//        super.hi();
//    }
}

class E {
    // 如果我们要求类的某个属性不能被修改，可以使用final修饰
    public double TAX_RATE = 0.08;

    // main里： E e = new E(); e.TAX_RATE = 0.09;
}

class F {
    public void cry(){
        // 如果我们要求某个局部变量不能被修改，可以使用final修饰
        final double NUM = 0.01;
        // NUM = 0.09;

    }
}
