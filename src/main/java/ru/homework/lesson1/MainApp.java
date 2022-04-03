package ru.homework.lesson1;

public class MainApp {
    public static void main(String[] args) {
        int sum;
        //System.out.println("Hello world");
        //string();
        dia();
        //quadroDia();
        //quadroQuadro();
        System.out.println(rEturn());
    }

    public static void string() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if ((j + i) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void dia() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i > j) {
                    System.out.print("* ");
                } else if (i < j) {
                    System.out.print("0 ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }

    public static void quadroDia() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 5 || j == 0) {
                    System.out.print("0 ");
                } else if (i == 0 || j == 5) {
                    System.out.print("0 ");
                } else if (i < j) {
                    System.out.print("  ");
                } else if (i > j) {
                    System.out.print("  ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    public static void quadroQuadro() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 5 || j == 0) {
                    System.out.print("0 ");
                } else if (i == 0 || j == 5) {
                    System.out.print("1 ");
                } else if (i == 4 || j == 1) {
                    System.out.print("2 ");
                } else if (i == 1 || j == 4) {
                    System.out.print("3 ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

    static int rEturn() {
        int a = 10, b = 5, c = 1;
        return c + a + b;
    }
}

