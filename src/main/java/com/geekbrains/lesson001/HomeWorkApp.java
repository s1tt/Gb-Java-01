package com.geekbrains.lesson001;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 2;
        int b = 3;
        if (a + b >= 0) {
            System.out.println("The sum of the numbers is positive");
        } else {
            System.out.println("The sum of the numbers is negative");
        }
    }

    public static void printColor() {
        int value = 6;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    public static void compareNumbers(){
        int a = 3;
        int b = 4;
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
