package ru.homework.lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        proverka();
        negativeOrPositive();
        trueFalse();
        iter();
    }

    public static void proverka() {
        int a = 5, b = 10;
        int sum = a + b;
        if (sum <= 20 && sum >= 10) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void negativeOrPositive() {
        int a = 5;
        if (a < 0) {
            System.out.println("Negative");
        } else if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Incorrect number");
        }
    }

    public static void trueFalse() {
        int a = -5;
        if (a > 0) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }

    public static void iter() {
        int a = 5;
        String b = "Lerning";
        for (int i = 1; i <= a; i++) {
            System.out.println(b);
        }
    }
}
