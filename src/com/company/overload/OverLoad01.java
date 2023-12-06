package com.company.overload;

public class OverLoad01 {
    public static void main(String[] args) {
        MyCalculator mc = new MyCalculator();
        System.out.println(mc.calculate(1, 2));
        System.out.println(mc.calculate(1.1, 2));
        System.out.println(mc.calculate(2.1, 1));
        System.out.println(mc.calculate(1, 2, 3));
    }

}