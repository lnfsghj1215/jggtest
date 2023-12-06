package com.company.overload;

public class VarParaCalculator {

//    public int sum(int n1, int n2) {
//        return n1 + n2;
//    }
//    public int sum(int n1, int n2, int n3) {
//        return n1 + n2 + n3 ;
//    }
//    public int sum(int n1, int n2, int n3, int n4) {
//        return n1 + n2 + n3 + n4;
//    }
    // 上面上个方法名称相同，功能相同，参数个数不同，可以使用可变参数优化
    /*
    * 1、int... 表示接收的是可变参数，类型是int，即可以接受多个int(另个到多个)
    * 2、使用可变参数时，可以把参数当数组来使用，即nums可以当做数组
    * */
    public int sum(int... nums) {
        System.out.println("接收的参数个数为：" + nums.length);
        int res = 0;
        for ( int i = 0; i < nums.length; i ++) {
            res += nums[i];
        }
        return res;
    }

    // 细节：可变参数可以和普通类型的参数一起放在形参列表里，但必须保证可变参数在最后
    public void sum2(double n1, int... nums){

    }
}
