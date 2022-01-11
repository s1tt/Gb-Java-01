package com.geekbrains.lesson007;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cat> listOfCats = new ArrayList<>();
        listOfCats.add(new Cat("Барсик", 110));
        listOfCats.add(new Cat("Мупсик", 8));
        listOfCats.add(new Cat("Куксик", 20));
        listOfCats.add(new Cat("Пупсик", 60));
        listOfCats.add(new Cat("Кексик", 19));

        Plate plate = new Plate(100);

        plate.info();

        for (Cat cat : listOfCats) {
            cat.eat(plate);
            plate.info();
        }

        plate.increaseFood(900);
        plate.info();
    }
}
