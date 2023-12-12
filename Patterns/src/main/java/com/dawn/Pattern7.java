package com.dawn;

import java.util.Scanner;

public class Pattern7 {

  public static void main(String[] args) {
    System.out.println("Hollow full pyramid pattern: ");
    Scanner scn = new Scanner(System.in);
    System.out.println("Input an integer: ");
    int N = scn.nextInt();

    for (int i = 0; i < N; i++) {
      int k = 0;
      for (int j = 0; j < ((2 * N) - 1); j++) {
        if (j < N - i - 1) {
          System.out.print("  ");
        } else if (k < (2 * i + 1)) {
          if (k == 0 || k == 2 * i || i == N - 1) {
            System.out.print("* ");
          } else {
            System.out.print("  ");
          }
          k++;
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
