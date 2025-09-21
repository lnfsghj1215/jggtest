package com.company.java_oop.l0246_this_test;

public class this01 {
    public static void main(String[] args) {
        THIS_DOG dog1 = new THIS_DOG("jack", 3);
        System.out.println("实例化对象的哈希码是：" + dog1.hashCode());
        dog1.info2();
    }
}

class THIS_DOG{
    String name;
    int age;

    /*
     * java虚拟机会给每个对象分配this，代表当前对象
     * 访问构造器方法：this(参数列表)
     * 注意只能在构造器中使用，即只能在构造器中访问另一个构造器
     * this不能在类定义的外部使用，只能在类定义的方法中使用
     */

    public THIS_DOG(String name, int age){
        // 根据变量的作用域原则，如果使用下面的赋值，构造器的name就是局部变量，而不是属性。赋值之后是空的
        // name = name; 这里name是指方法中的局部变量，而不是类的属性
        // age = age;
        this.name = name; // this.name 就是当前对象的属性name
        this.age = age; // this.age 就是当前对象的属性age
    }

    public void info(){
        System.out.println(name + "\t" + age + "\t");
        System.out.println("当前对象的哈希码是：" + this.hashCode());
    }

    // 访问成员方法的语法：this.方法名(参数列表)
    public void info2(){
        this.info();
    }
}