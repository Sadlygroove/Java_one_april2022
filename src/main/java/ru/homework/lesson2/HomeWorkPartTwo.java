package ru.homework.lesson2;

import java.util.Arrays;

public class HomeWorkPartTwo {
    public static void main(String[] args) {
        // Massive();
        //eight();
        //multiplication();
        //diag();
        findMax();
    }

    // Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void Massive() {
        int[] nullOne = {1, 0, 1, 0, 1, 1, 1, 0, 1, 1};
        for (int i = 0; i < nullOne.length; i++) {
            if (nullOne[i] == 1) {
                nullOne[i] = 0;
            } else {
                nullOne[i] = 1;
            }
        }
        System.out.println(Arrays.toString(nullOne));
    }

    // 2. Задать пустой целочисленный массив размером 8.
    // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void eight() {
        int[] eight = new int[8];
        for (int i = 0; i < eight.length; i++) {
            eight[i] = i * 3;
        }
        System.out.println(Arrays.toString(eight));
    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void multiplication() {
        int[] multi = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < multi.length; i++) {
            if (multi[i] < 6) {
                multi[i] = multi[i] * 2;
            }
        }
        System.out.println(Arrays.toString(multi));
    }

    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void diag() {
        int[][] diag = new int[5][5];
        for (int i = 0; i < diag.length; i++) {
            for (int j = 0; j < diag.length; j++) {
                if (i == j) {
                    diag[i][j] = 1;
                    System.out.print(diag[i][j] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();

        }
        System.out.println(Arrays.toString(diag));
    }
    //5. ** Задать одномерный массив и найти в нем минимальный
    //    и максимальный элементы (без помощи интернета);\

    public static void findMax() {
        int [] findMax = {1, 5, 3, 2, 11, 4, 25, 2, 4, 8, -9, 1};
        int max = 0;
        int min = 1;
        for (int i = 0; i < findMax.length; i++) {
            if (max < findMax[i]) {
                max = findMax[i];
            } else if (min > findMax[i]) {
                min = findMax[i];
            }
        }
        System.out.println("Max: " + max + " Min: " + min);
    }
}
