package com.company.java_oop.l0382_main;

public class MainArgs {

    private static  String name = "jgg";

    public static void hello(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
        System.out.println(name);
        hello();
    }
}
