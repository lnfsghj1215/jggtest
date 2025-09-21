package com.company.java_oop.l0402_interface;

public class Interface01 {
    public static void main(String[] args) {
        // 创建手机、相机对象
        Camera camera1 = new Camera();
        Phone phone1 = new Phone();

        Computer computer1 = new Computer();

        computer1.work(camera1); // 把相机接入到相机

        computer1.work(phone1); // 把手机接入到相机

    }
}
