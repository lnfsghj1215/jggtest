package com.company.loop_control;

public class ReturnClass {
    public static void main(String[] args) {
        // 当return用在方法时，表示跳出方法，如果在main，表示退出程序
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                return;
            }
            System.out.println(i);
        }
    }
}
