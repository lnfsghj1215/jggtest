package com.company.l0307_objpoly;

public class PolyObject {
    public static void main(String[] args) {
        /*
         * 对象的多态
         * 1、一个对象的编译类型和运行类型可以不一致
         * 2、编译类型在定义对象时，就确定了，不能改变
         * 3、运行类型时可以变化的
         * 4、编译类型看定义时 = 号左边，运行类型看 = 号右边
         * 例子：
         *  Animal animal = new Dog("d1");
         *  animal = new Cat("c1");
         */
        /* 多态的向上转型
        *  1、父类的引用指向了子类的对象
        *  2、语法：父类类型引用名 = new 子类类型()；
        *  3、特点：
        *       编译类型看左边，运行类型看右边；
        *       可以调用父类中的所有成员（需遵守访问权限）
        *       不能调用子类中特有成员
        *       最终运行效果看子类的具体实现！
        * */
        Animal animal = new Dog();
        // 运行时，animal的运行类型是Dog
        animal.cry();

        animal = new Cat();
        // 运行时，animal的运行类型是Cat
        animal.cry();

        /*  多态的向下转型
         *  1、语法：子类类型 引用名 =  (子类类型) 父类引用；
         *  2、特点：
         *      只能强转父类的的引用，不能强转父类的对象
         *      要求父类的引用必须指向的是当前目标类型的对象
         *      当向下转型后，可以调用子类类型中所有的成员
         * */

        /*
        * 属性没有重写只说！属性的值看编译类型
        * instanceOf 比较操作符，用于判断对象的运行类型是否喂XX类型或者XX类型的子类型
        * */
        Cat cat = (Cat) animal;
        cat.cry();
    }
}
