package com.houserent.service;

import com.houserent.model.House;

/*
* HouseService.java 业务层
* 定义House[]，保存House 对象
* 1、相应Houseview的调用
* 2、完成对房屋信息的各种操作crud
* */

public class HouseService {
    private House[] houses;
    private int houseNum = 1; // 记录当前有多少个房屋信息
    private int houseCounter = 1; // 记录当前id增长到哪个值

    public HouseService(int size) {
        houses = new House[size];
        houses[0] = new House(1, "jack", "111", "北京", 2000, "未出租");
    }

    // list方法，返回houses
    public House[] list(){
        return houses;
    }

    // add方法，新增house
    public boolean add(House newHouse) {
        // 判断是否可以继续添加（暂不考虑数组扩容）
        if (houseNum >= houses.length) {
            System.out.println("!!!数组已满，无法添加!!!");
            return false;
        }
        // id自增长，先++再set
        newHouse.setId(++houseCounter);
        // 把newHouse加入到数组，先加入数组再++
        houses[houseNum++] = newHouse;
        return true;
    }

    public boolean del(int delId) {
        for (int i = 0; i < houseNum; i++) {
            if (houses[i].getId() == delId) {
                houses[i] = null;
                houseNum--;

                return true;
            }
        }
        return false;
    }
}
