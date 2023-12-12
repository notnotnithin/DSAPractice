package com.dawn;

import java.util.Scanner;

public class Pattern5 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Input an integer: ");
    int N = scn.nextInt();
    for (int ROWS = 0; ROWS < N; ROWS++) {
      for (int COLS = 0; COLS < N; COLS++) {
        if (ROWS == 0 || ROWS == (N - 1) || COLS == 0 || COLS == (N - 1)) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
