package com.company.java_oop.l0402_interface;

public class Computer {
    // 编写一个方法
    public void work(UsbInterface usbInterface) {

        // 通过接口来调用方法
        usbInterface.start();
        usbInterface.stop();
    }
}
