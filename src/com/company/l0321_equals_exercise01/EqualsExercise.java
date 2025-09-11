package com.company.l0321_equals_exercise01;

public class EqualsExercise {
    public static void main(String[] args) {
        Person person1 = new Person("jack", 10, 'M');
        Person person2 = new Person("jack", 10, 'M');
        System.out.println(person1.equals(person2));
    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Person) {
            Person p = ((Person) obj);
            return p.name.equals(this.name)  && p.age == this.age && p.gender == this.gender;
        }
        return false;
    }

}
