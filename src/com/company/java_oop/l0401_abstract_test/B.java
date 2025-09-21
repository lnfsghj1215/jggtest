package com.company.java_oop.l0401_abstract_test;

public class B extends Template {

    // 计算任务
    // 1+,,,+10000
    public void job() { // 实现了父类的抽象方法
        int num = 0;
        for (int i = 1; i <= 100000; i++) {
            num += i;
        }
    }
}
