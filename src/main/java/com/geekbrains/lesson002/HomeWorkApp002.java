package com.geekbrains.lesson002;

public class HomeWorkApp002 {

    public static void main(String[] args) {
        System.out.println(within10and20(7,3));
        isPositiveOrNegativeNumber(0);
        System.out.println(isNegativeNumber(0));
        printText("I love Java", 3);
        System.out.println(isLeapYear(2000));
    }

    /*
    Написать метод, принимающий на вход два целых числа
    и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false.
    */

    public static boolean within10and20(int a, int b){
        return (a + b >= 10) && (a + b <= 20);
    }

    /*
    Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или
    отрицательное. Замечание: ноль считаем положительным числом.
    */

    public static void isPositiveOrNegativeNumber(int a){
        if (a >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }

    /*
    Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное,
    и вернуть false если положительное.
    */

    public static boolean isNegativeNumber(int a){
        return a < 0;
    }

    /*
    Написать метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз;
    */

    public static void printText(String a, int count){
        for (int i = 0; i < count; i++) {
            System.out.println(a);
        }
    }

    /*
    Написать метод, который определяет, является ли год високосным, и возвращает boolean
    (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого
    100-го, при этом каждый 400-й – високосный.
    */

    public static boolean isLeapYear(int a){
        return ((a % 100 != 0) && (a % 4 == 0)) || (a % 400 == 0);
    }


}
