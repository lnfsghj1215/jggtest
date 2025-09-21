package com.company.java_oop.l0305_poly;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // animal编译类型是Animal，可以接受Animal子类的对象
    // food编译类型是Food，可以接受Food子类的对象
    public void feed(Animal animal,  Food food){
        System.out.println("主人" + this.name + "给" + animal.getName() + "喂" + food.getName());
    }
}
