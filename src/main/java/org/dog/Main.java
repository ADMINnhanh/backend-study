package org.dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "旺财";
        dog.age = 3;
        dog.color = "白色";

        System.out.println("狗的名字是：" + dog.name);
        System.out.println("狗的年龄是：" + dog.age);
        System.out.println("狗的颜色是：" + dog.color);

        dog.cry();
        System.out.println("狗叫！");
    }
}