package com.company.java_oop.l0410_interface_poly_pass;

/*
* 多态传递
* */

public class InterfacePolyPass {
    public static void main(String[] args) {
        // 接口类型的变量可以指向实现了该接口的类的对象实例
        IB t1 = new Teacher();

        // 如果 IB集成了IA，而Teacher实现了IB
        // 那么，实际上相当于Teacher也实现了IA
        // 这就是 接口多态传递
        IA t2 = new Teacher();
    }
}

interface IA {}
interface IB extends IA {}

class Teacher implements IB {

}