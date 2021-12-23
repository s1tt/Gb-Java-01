package com.geekbrains.lesson003;

import java.util.Arrays;

public class HomeWorkApp003 {
    public static void main(String[] args) {
        array1(new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0});
        array2(100);
        array3(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
        array4(new int[10] [10]);
        System.out.println(Arrays.toString(array5(4,6)) + "\n");
        array6(new int[]{1, 55, 444, 2, 43, 456456, 23, 6345, 21, 45, 3, 1});
        arrayShift(new int[] {1, 2, 3, 4, 5}, 0);
    }

/*    Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и
    условия заменить 0 на 1, 1 на 0;    */

    static void array1(int[] array) {
        System.out.println("Array before method starts: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println("Array after method starts: " + Arrays.toString(array) + "\n");
    }

/*    Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
    значениями 1 2 3 4 5 6 7 8 … 100;*/

    static void array2(int arrayLength) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array) + "\n");
    }

/*    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    пройти по нему циклом, и числа меньшие 6 умножить на 2;*/

    static void array3(int[] array){
        System.out.println("Array before method starts: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++){
            if (array[i] < 6){
                array[i] *= 2;
            }
        }
        System.out.println("Array after method starts: " + Arrays.toString(array) + "\n");
    }

/*    Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из
    диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему
    принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];*/

    static void array4(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == i || i + j == array.length - 1){
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("\n");
    }

/*    Написать метод, принимающий на вход два аргумента: len и initialValue, и
    возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;*/

    static int[] array5(int len, int initialValue){
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++){
            array[i] = initialValue;
        }
        return array;
    }

//    * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

    static void array6(int[] array){
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            } else if ( array[i] < min){
                min = array[i];
            }
        }
        System.out.println("max: " + max + " min: " + min + "\n");
    }

/*    *** Написать метод, которому на вход подается одномерный массив и число n
    (может быть положительным, или отрицательным), при этом метод должен
    сместить все элементы массива на n позиций. Элементы смещаются циклично.
    Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
    при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.*/

    public static void arrayShift(int[] array, int count){
        int size = array.length;
        if (count > 0){
            for (int i = 0; i < count; i++) {
                int temp = array[size - 1];
                for (int j = size - 1; j > 0; j--) {
                    array[j] = array[j-1];
                }
                array[0] = temp;

            }
        } else if (count < 0){
            for (int i = count; i < 0; i++){
                int temp = array[0];
                for (int j = size - 1; j >= 0; j--){
                    int current = array[j];
                    array[j] = temp;
                    temp = current;
                }
            }
        } else {
            System.out.println("Число равно нулю");
        }
        System.out.println(Arrays.toString(array));
    }
}


