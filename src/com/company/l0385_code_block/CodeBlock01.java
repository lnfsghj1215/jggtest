package com.company.l0385_code_block;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie m1 = new Movie("泰坦尼克号");
        Movie m2 = new Movie("海上钢琴师", 20);
        Movie m3 = new Movie("爆裂鼓手", 25, "J");
    }

}

class Movie {
    private String name;
    private double price;
    private String director;

    // 三个构造器
    // 1、下面三个构造器都有相同语句，冗余
    // 2、把相同语句放到一个代码块中
    // 3、这样当我们不管调用哪个构造器创建对象，都会先调用代码块的内容
    // 4、代码块调用优先于构造器
    {
        System.out.println("电影屏幕打开");
        System.out.println("广告开始");
        System.out.println("电影正式开始");
    }


    public Movie(String name) {
        System.out.println(this + "被调用");
        this.name = name;
    }

    public Movie(String name, double price) {
        System.out.println(this + "被调用");
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        System.out.println(this + "被调用");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}