package com.company.encapsulation_03;

public class Encap01 {
    public static void main(String[] args) {
        /*
        * 面向对象编程-封装
        * 封装(encapsulation)就是把抽象出的数据[属性]和对数据的操作[方法]状在一起，数据被保护在内部，
        * 程序的其他部分只有通过被授权的操作[方法]，才能对数据进行操作。
        * 封装的理解和好处
        * 1、隐藏实现细节：方法 <-- 调用
        * 2、可以对数据进行验证，保证安全合理
        * */
        PersonEncap01 p1 = new PersonEncap01( "Jack", 18, 10000);
        p1.info();
    }
}

class PersonEncap01 {
    public String name; // 名字公开
    private int age;    // age私有化
    private double salary; // 工资私有化

    public PersonEncap01() {
    }

    public PersonEncap01(String name, int age, double salary) {
        // this.name = name;
        // this.age = age;
        // this.salary = salary;
        //可以将set方法放在构造器中
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    // 使用Generate自动东生成get和set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        }
        else {
            System.out.println("名称长度不合理，赋予默认值");
            this.name = "无名";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <=120){
            this.age = age;
        }
        else {
            System.out.println("设置的年龄不合理，赋予默认值");
            this.age = 18;
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void info(){
        System.out.println(this.name + this.age + this.salary);
    }
}