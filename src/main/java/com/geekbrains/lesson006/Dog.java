package com.geekbrains.lesson006;

public class Dog extends Animal {
    private static int count;

    protected Dog(String type, String name) {
        this.type = type;
        this.name = name;
        count++;
    }

    protected static int getCount(){
        return count;
    }

    @Override
    protected int maxRunningDistance() {
        return 500;
    }

    @Override
    protected int maxSwimmingDistance() {
        return 10;
    }
}
