package com.company.l0315_poly_array;

public class Teacher extends Person{
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String say() {
        return "老师" + super.say() + "salary=" + salary;
    }

    public void teach(){
        System.out.println("老师" + this.getName() + "在授课");
    }
}
