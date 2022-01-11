package com.geekbrains.lesson007;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;

    protected Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    protected void eat(Plate p) {
        if (p.getFood() > appetite) {
            p.decreaseFood(appetite);
            satiety = true;
            System.out.println("Кот " + name + " съедает " + appetite + " кусков корма! (сытость: " + satiety + ")");
        } else {
            System.out.println("Коту " + name + " не хватило корма! " + name + " хочет съесть " + appetite + " кусков, а осталось " + p.getFood() + " (сытость: " + satiety + ")");
        }
    }
}
