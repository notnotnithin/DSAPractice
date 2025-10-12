package com.dawn;

public class Pattern25 {

    static void main() {
        int num = Integer.parseInt(IO.readln("Enter a number: "));
        IO.println("Square pattern");
        printSquarePattern(num);
        IO.println("Rectangle pattern");
        printRectanglePattern();
        IO.println("Hollow Rectangle pattern");
        printHollowRectanglePattern(num);
        IO.println("Solid Pyramid pattern");
        printSolidHalfPyramidPattern(num);
    }

    static void printSquarePattern(int num) {
        for (int row = 0; row < num; row++) {
            for (int col = 0; col < num; col++) {
                IO.print("* ");
            }
            IO.println();
        }
    }

    static void printRectanglePattern() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 5; col++) {
                IO.print("* ");
            }
            IO.println();
        }
    }

    static void printHollowRectanglePattern(int num) {
        for (int row = 0; row < num; row++) {
            for (int col = 0; col < num; col++) {
                if (row == 0 || row == num - 1) {
                    IO.print("* ");
                } else {
                    if (col == 0 || col == num - 1) {
                        IO.print("* ");
                    } else {
                        IO.print("  ");
                    }
                }
            }
            IO.println();
        }
    }

    static void printSolidHalfPyramidPattern(int num) {
        for (int row = 0; row < num; row++) {
            for (int col = 0; col < row + 1; col++) {
                IO.print("* ");
            }
            IO.println();
        }
    }
}