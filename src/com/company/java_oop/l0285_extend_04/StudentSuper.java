package com.company.java_oop.l0285_extend_04;

public class StudentSuper {
    public String name;
    public int age;
    private double score;

    public StudentSuper(){
        System.out.println("父类的无参构造器被调用");
    }
    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo() {
        System.out.println("学生" + this.name + "年龄" + this.age + "分数" + this.score);
    }
}
