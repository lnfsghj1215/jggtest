package com.company.l317_poly_param;

public class PolyParameter {
    public static void main(String[] args) {
        Test t = new Test();
        Employee e1 = new Worker("jack", 12000);
        t.showEmpAnnual(e1);
        Employee e2 = new Manager("lucy", 15000, 100000);
        t.showEmpAnnual(e2);
    }
}

class Test {
    public void showEmpAnnual(Employee e) {
        System.out.println(e.getName() + "年薪是" + e.getAnnual());
        if (e instanceof Worker) {
            ((Worker) e).work();
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        }else {

        }
    }
}

