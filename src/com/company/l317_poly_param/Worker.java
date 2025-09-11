package com.company.l317_poly_param;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("普通员工" + getName() + " is working");
    }

    @Override
    public double getAnnual() { // 普通员工没有其他收入
        return super.getAnnual();
    }
}
