package com.company.java_oop.l0315_poly_array;

public class PolyArray {
    public static void main(String[] args) {
        /* 应用实例：现有一个继承结构如下：
         * 要求创建1个Person对象，2个Student对象和2个Teacher对象,
         * 统一放在数组中，并调用每个对象的say方法
         */
        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("joe", 18, 100);
        persons[2] = new Student("tom", 17, 99);
        persons[3] = new Teacher("Miss Wang", 30, 8000);
        persons[4] = new Teacher("Miss Chen", 35 , 20000);

        for (Person person : persons) {
            // person编译类型是Person，运行类型是根据实际情况由JVM来判断
            System.out.println(person.say()); //动态绑定机制
            /*
            * Teacher由teach，Student有study，怎么调用？
            * */
            if (person instanceof Student){
                ((Student) person).study();
            } else if (person instanceof Teacher) {
                ((Teacher) person).teach();
            }
        }
    }
}


