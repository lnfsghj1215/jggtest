package com.houserent.view;

/*
* 1、显示界面
* 2、接受用户输入
* 3、调用HouseService完成对房屋信息的各种操作
* */

import com.houserent.model.House;
import com.houserent.service.HouseService;
import com.houserent.utils.Utility;

public class HouseView {
    private boolean loop = true; // 控制显示菜单
    private char key = ' '; // 接受用户输入
    private String desc = "=".repeat(10);

    private HouseService houseService = new HouseService(10) ; // 设置数组大小为10

    // 编写listHouse()显示房屋列表
    public void listHouse(){
        System.out.println(desc + "房屋列表" + desc);
        House[] houses = houseService.list();
        for (House house : houses) {
            if (house != null){ // 为空不显示
            System.out.println(house.toString());
            }
        }
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态");
        System.out.println(desc + "房屋列表显示完成" + desc);

    }

    // 编写addHouse() 接受输入，创建House，调用add方法
    public void addHouse() {
        System.out.println(desc + "添加房屋" + desc);
        System.out.println("请输入房主姓名:");
        String name = Utility.readString(5, "未知姓名");
        System.out.println("请输入电话:");
        String phone = Utility.readString(11, "未知手机");
        System.out.println("请输入地址:");
        String address = Utility.readString(10, "未知地址");
        System.out.println("请输入月租:");
        int rent = Utility.readInt(1000);
        System.out.println("状态:");
        String state = Utility.readString(3,"未出租");
        House house = new House(0, name, phone, address, rent, state);
        if (houseService.add(house)) {
            System.out.println("添加房屋成功！！！");
        }else {
            System.out.println("添加房屋失败！！！");
        }
        listHouse();
    }

    public void delHouse(){
        System.out.println(desc + "删除房屋" + desc);
        System.out.println("请选择删除房屋编号(-1退出):");
        int delId = Utility.readInt();
        if (delId == -1){
            System.out.println("已退出");
            return;
        }
        char delSelect = ' ';
        do {
            System.out.println("请确认是否删除(Y/N)，请小心选择:");
            delSelect = Utility.readChar();
        }while (!(delSelect == 'Y' || delSelect == 'N'));
        if (delSelect == 'Y'){
            if (houseService.del(delId)) {
                System.out.println("删除房屋成功！！！");
            }else {
                System.out.println("删除房屋失败！！！");
            }
        }else {
            System.out.println("退出删除");
        }
    }


    public void mainMenu() {
        do {
            System.out.println("\n" + desc + "房屋出租系统" + desc);
            System.out.println("\t\t\t1 新增房源");
            System.out.println("\t\t\t2 查找房源");
            System.out.println("\t\t\t3 删除房屋信息");
            System.out.println("\t\t\t4 修改房屋信息");
            System.out.println("\t\t\t5 显示房屋信息");
            System.out.println("\t\t\t6 退       出");
            System.out.println("请输入你的选择(1-6)");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    System.out.println("新增");
                    addHouse();
                    break;
                case '2':
                    System.out.println("查找");
                    break;
                case '3':
                    System.out.println("删除");
                    delHouse();
                    break;
                case '4':
                    System.out.println("修改");
                    break;
                case '5':
                    System.out.println("显示");
                    listHouse();
                    break;
                case '6':
                    System.out.println("退出");
                    loop = false;
                    break;
            }
        } while (loop);
    }
}