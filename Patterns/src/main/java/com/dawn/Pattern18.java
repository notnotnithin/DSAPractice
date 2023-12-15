package com.dawn;

import java.util.Scanner;

public class Pattern18 {

  public static void main(String[] args) {
    System.out.println("Numeric hollow inverted half pyramid pattern:");
    Scanner scn = new Scanner(System.in);
    System.out.println("Input an integer: ");
    int N = scn.nextInt();

    /**
     *
     * 12345
     * 2  5
     * 3 5
     * 45
     * 5
     *
     */

    for (int row = 1; row <= N; row++) {
      int k = row;
      for (int col = 1; col <= N - row + 1; col++) {
        if (col == 1 || col == N - row + 1) {
          System.out.print(k);
        } else {
          if (row == 1) {
            System.out.print(k);
          } else {
            System.out.print(" ");
          }
        }
        k++;
      }
      System.out.println();
    }
  }
}
