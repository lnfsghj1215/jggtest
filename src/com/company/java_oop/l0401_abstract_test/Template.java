package com.company.java_oop.l0401_abstract_test;

abstract public class Template { // 抽象类-模版设计模式
    public abstract void job();

    public void calculateTime () { // 实现了的方法
        // 得到开始时间
        long start = System.currentTimeMillis();
        job(); // 动态绑定机制
        long end = System.currentTimeMillis();
        // 得到结束时间
        System.out.println("执行时间" + (end - start));
    }
}
