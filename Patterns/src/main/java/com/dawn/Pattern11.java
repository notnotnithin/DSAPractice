package com.dawn;

import java.util.Scanner;

public class Pattern11 {

  public static void main(String[] args) {
    System.out.println("Diamond pyramid pattern: ");
    Scanner scn = new Scanner(System.in);
    System.out.println("Input an integer: ");
    int N = scn.nextInt();

    for (int row = 1; row <= N; row++) {
      for (int col = 1; col <= N - row; col++) {
        System.out.print(" ");
      }

      for (int col = 1; col <= 2 * N - 1; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
