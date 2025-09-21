package com.company.java_oop.l0391_single_instance;

import org.w3c.dom.ls.LSOutput;

public class SingleTon01 {
    public static void main(String[] args) {
        // 通过静态方法获取对象
        System.out.println("go");
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
        GirlFriend instance2 = GirlFriend.getInstance();
        System.out.println(instance2);
    }


}

// 有一个类，GirlFriend
// 只能有一个女朋友
class GirlFriend {
    private String name;

    // 如何保证只有一个对象
    // 1、构造器私有化
    // 2、在类的内部直接静态创建实例
    // 3、提供一个公共的static方法，返回gf对象
    private GirlFriend(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }

    // 因为静态方法只能调用静态对象，所以实例对象也要静态
    // 饿汉式：没有使用实例时，实例就已经创建好了，可能造成资源浪费
    private static GirlFriend gf = new GirlFriend("小皮皮");

    public static GirlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return super.toString() + name;
    }
}
