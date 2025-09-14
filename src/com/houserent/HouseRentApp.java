package com.houserent;

import com.houserent.view.HouseView;

public class HouseRentApp {
    public static void main(String[] args) {
        // 创建HouseView，并且展示主菜单，是整个程序的入口
        HouseView houseView = new HouseView();
        houseView.mainMenu();
        System.out.println("==你退出了房屋出租系统==");

    }
}
