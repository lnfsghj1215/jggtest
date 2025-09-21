package com.company.java_oop.l0418_anonymous_inner_class_exercise;

public class InnerClassExercise {
    public static void main(String[] args) {
        f1(new IA(){
            @Override
            public void show() {
                System.out.println("展示嘿嘿...");
            }
        });
    }

    public static void f1 (IA ia) {
        ia.show();
    }
}

interface IA {
    void show();
}