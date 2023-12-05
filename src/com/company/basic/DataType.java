package com.company.basic;

public class DataType {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello" + 100 + 3);
        // 定义变量a，类型为int
        int a = 1;
        // Java的浮点类型常量(具体值)默认是double类型，声明float类型时，须在后面加'f'或'F'
        float num1 = 1.1f;  // 不加f会报错，因为把常量值默认是double，值赋值给float类型会有精度损失
        double num2 = 1.1; // 正确
        double num3 = 1.1f; //正确，低精度常量放到高精度变量
        // 通常情况下使用double
        // 对运算结果是小数时，不能用 == ，因为有精度损失，一般是判断判断结果在某个范围内则认为相等
        double f1 = 2.7;
        double f2 = 8.1 / 3;
        if ((Math.abs(f1 - f2)) < 0.00001){
            System.out.println("差值很小，认为相等");
        // String -> 对应的基本数据类型
        String s1 = "123";
        String s2 = "1.1f";
        String s3 = "1.123";
        String s4 = "true";
        int num_s1 = Integer.parseInt(s1);
        float num_s2 = Float.parseFloat(s2);
        double num_s3 = Double.parseDouble(s3);
        boolean b_s4 = Boolean.parseBoolean(s4);

        }
    }
}
    /*
    * 基本数据类型：
    *   整数型：
    *       整数型
    *           byte[1] -128~127
    *           short[2]    -2^16 ~ 2^16
    *           int[4]  -2^31 ~ 2^31 - 1
    *           long[8] -2^63 ~ 2^64 - 1
    *       浮点型：
    *           float[4]
    *           double[8]
    *   字符型：
    *       char[2] 存放单个字符
    *   布尔类型：
    *       boolean[1] 存放true，false
    * 引用数据类型：
    *   类(class) String也是类
    *   接口(interface)
    *   数组([])
    * */