package com.company.class_object;

public class MethodParameter2 {
    public static void main(String[] args) {

    }
}


class MP2 {
    // MP类中test方法，接收一个数组，在方法中修改该数组
    public void test(int[] arr) {
        arr[0] = 100;
        for (int e : arr) {
            System.out.println(e);
        }
    }
}