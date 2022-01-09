package com.geekbrains.lesson006;

public class Cat extends Animal {
    private static int count;

    protected Cat(String type, String name) {
        this.type = type;
        this.name = name;
        count++;
    }

    protected static int getCount(){
        return count;
    }

    @Override
    protected int maxRunningDistance() {
        return 200;
    }

    @Override
    protected int maxSwimmingDistance(){
        return 0;
    }

    @Override
    protected void swim(int swimmingDistance) {
        System.out.println("Кошки не плавают!");
    }
}
