package com.dawn;

import java.util.Scanner;

public class Pattern13 {

  public static void main(String[] args) {
    System.out.println("Inverted hollow pyramid pattern with no base: ");
    Scanner scn = new Scanner(System.in);
    System.out.println("Input an integer: ");
    int N = scn.nextInt();

    for (int row = 0; row < N; row++) {
      for (int col = 0; col < row; col++) {
        System.out.print(" ");
      }
      for (int col = 0; col < N - row; col++) {
        if (col == 0 || col == (N - row) - 1) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
