package com.company.overload;

public class VarParameter {
    public static void main(String[] args) {
        VarParaCalculator vpc = new VarParaCalculator();
        System.out.println(vpc.sum(1,4,8,10));
        // 可变参数的实参可以为数组
        int[] arr = {1, 2, 3};
        System.out.println(vpc.sum(arr));
    }
}
