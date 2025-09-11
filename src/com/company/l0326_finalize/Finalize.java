package com.company.l0326_finalize;

public class Finalize {
    public static void main(String[] args) {
        Car bmw = new Car("li330");
        bmw = null;
        // 这是Car对象就是一个垃圾，垃圾回收器会回收（销毁）对象，
        // 在销毁对象前，会调用该对象的finalize方法，
        // 这是可以在finalize中，写自己的业务逻辑（比如释放资源：数据库链接，或者关闭文件）
        // 如果不重写finalize，那么调用Object的finalize，里面默认不做处理
        System.gc();
        System.out.println("程序退出了");
    }
}

class Car {

    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("销毁Car...");
    }
}
