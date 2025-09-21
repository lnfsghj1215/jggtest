package com.company.java_enums_annotate.l0424_enumeration;

import java.sql.SQLOutput;

public class Enumeration01 {
    public static void main(String[] args) {
        Season autumn = Season.AUTUMN;
        // 输出对象名字
        System.out.println(autumn.name());
        // 输出该枚举对象的索引
        System.out.println(autumn.ordinal());
        // 返回Season2[]，包含定义的所有枚举对象
        Season[] values = Season.values();
        for (Season value : values) {
            System.out.println(value);
        }
        // valueOf: 将字符串换成枚举对象，要求字符串必须为已有的常量名，否则报异常
        // 执行流程：
        // 1、根据输入的“AUTUMN”到Season的枚举对象查找
        // 2、如果找到了就返回，如果没有就报错
        Season autumn1 = Season.valueOf("AUTUMN");
        System.out.println(autumn1);

        // compareTo 比较两个枚举对象，比较的就是索引！结果是索引之差，前面减后面
        System.out.println(Season.SPRING.compareTo(Season.AUTUMN));
    }
}


enum Season {
    // 使用enum实现枚举类
    // 1、使用关键字enum
    // 2、直接说使用SPRING("春天", "温暖")   常量名(实惨列表)
    // 等价于：public static final Season SPRING = new Season("春天", "温暖");
    // 3、如果有多个常量，使用,间隔即可
    // 4、如果使用enum来实现美剧，要求将定义常量对象，写在前面

    SPRING("春天", "温暖"),
    WINTER("冬天", "寒冷"),
    AUTUMN("秋天", "凉爽"),
    SUMMER("夏天", "炎热");

    private String name;
    private String desc;

    Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}