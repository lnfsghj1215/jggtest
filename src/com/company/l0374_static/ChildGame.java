package com.company.l0374_static;

public class ChildGame {
    public static void main(String[] args) {

        Child c1 = new Child("jack");
        c1.joinGame();
        // count++;

        Child c2 = new Child("tom");
        c2.joinGame();
        // count++;

        Child c3 = new Child("jerry");
        c3.joinGame();
        // count++;

        System.out.println("一共有" + Child.count + "个小孩加入了游戏" );
        System.out.println("c1.count=" + c1.count);
        System.out.println("c1.count=" + c2.count);
        System.out.println("c1.count=" + c3.count);

    }
}

class Child {
    String name;

    // 定义一个变量count，是一个类变量（静态变量）
    // 会被Child类的所有对象实例共享
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public void joinGame(){
        System.out.println(name + "加入了游戏");
        count ++;
    }
}