package com.itheima.a03polymorphismdemo3;

public class Animal {
    private int age;
    private String color;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public Animal() {
    }

    public void eat(String something){
        System.out.println("动物再吃" + something);

    }
}
