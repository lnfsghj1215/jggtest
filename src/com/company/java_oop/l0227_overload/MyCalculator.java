package com.company.java_oop.l0227_overload;

public class MyCalculator {
    /*
    * 注意事项和使用细节
    * 1、方法名必须相同
    * 2、形参列表：必须不同，形参类型、个数和顺序，至少有一样不同。参数名无要求
    * 3、返回类型：无要求
    * */
    // 四个calculate构成重载
    // 两个int和
    public int calculate(int n1, int n2) {
        return n1 + n2;
    }
    // 一个int，一个double和
    public double calculate(int n1, double n2) {
        return n1 + n2;
    }

    // 一个double，一个int和
    public double calculate(double n1, int n2) {
        return n1 + n2;
    }

    // 三个int和
    public int calculate(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}


