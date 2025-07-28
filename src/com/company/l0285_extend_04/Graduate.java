package com.company.l0285_extend_04;

public class Graduate extends StudentSuper {
    public Graduate(){
        super();//默认调用父类的无参构造器
        System.out.println("调用子类无参构造器");
    }
    public void testing() {
        System.out.println("大学生" + this.name + "正在大学考试");
    }
}
