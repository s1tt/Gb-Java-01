package com.geekbrains.lesson007;

public class Plate {
    private int food;

    protected Plate(int food) {
        this.food = food;
    }

    protected void decreaseFood(int appetite) {
        if (appetite <= food){
            food -= appetite;
        }
    }

    protected void increaseFood(int addFood) {
        food += addFood;
        System.out.println("В миску добавлено " + addFood + " кусков корма");
    }

    protected int getFood() {
        return food;
    }

    protected void info() {
        System.out.println("В миске осталось " + food + " кусков.");
    }

}
