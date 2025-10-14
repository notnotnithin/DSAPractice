package com.dawn;

public class Pattern2 {

    static void main(String[] args) {
        int n = Integer.parseInt(IO.readln("Enter a number: "));
        System.out.println("Inverted Half Pyramid Pattern!");
        invertedHalfPyramid(n);

        System.out.println("Numerical Half Pyramid Pattern!");
        numericHalfPyramid(n);

        System.out.println("Inverted Numeric Half Pyramid Pattern!");
        invertedNumericHalfPyramid(n);
    }

    private static void invertedHalfPyramid(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                IO.print("* ");
            }
            IO.println();
        }
    }

    private static void numericHalfPyramid(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row + 1; col++) {
                IO.print(col + 1);
            }
            IO.println();
        }
    }

    private static void invertedNumericHalfPyramid(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= n - row - 1; col++) {
                IO.print(col + 1);
            }
            IO.println();
        }
    }
}
