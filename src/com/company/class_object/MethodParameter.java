package com.company.class_object;

public class MethodParameter {
    public static void main(String[] args) {
        MP mp = new MP();
        int[] arr = {1, 2, 3};
        mp.test(arr);
        for (int e : arr) {
            System.out.println(e);
        }
    }
}


class MP {
    // MP类中test方法，接收一个数组，在方法中修改该数组
    public void test(int[] arr) {
        arr[0] = 100;
        for (int e : arr) {
            System.out.println(e);
        }
    }
}