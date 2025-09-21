package com.company.java_oop.l0305_poly;

import com.company.java_oop.l0279_modifier_02.B;

public class Poly01 {
    public static void main(String[] args) {
        Master master = new Master("Tom");
        Animal animal = new Dog("Dog1");
        Food food = new Bone("bone1");
        master.feed(animal, food);

    }
}
