package com.geekbrains.lesson006;

public class Main {
    public static void main(String[] args) {
        Cat catAsya = new Cat("Кошка", "Ася");
        Cat catBarsik = new Cat("Кот","Барсик");
        Dog dogBarbossik = new Dog("Собака","Барбосик");
        Dog dogTuzik = new Dog("Собака","Тузик");

        dogBarbossik.run(50);
        dogBarbossik.swim(10);
        catAsya.run(200);
        catAsya.swim(201);
        catBarsik.run(10);
        dogTuzik.run(501);

        System.out.println("\nВсего создано животных: " + Animal.getCount());
        System.out.println("Собак: " + Dog.getCount());
        System.out.println("Кошек: " + Cat.getCount());
    }
}
