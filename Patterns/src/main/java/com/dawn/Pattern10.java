package com.dawn;

import java.util.Scanner;

public class Pattern10 {

  public static void main(String[] args) {
    System.out.println("Diamond pyramid pattern: ");
    Scanner scn = new Scanner(System.in);
    System.out.println("Input an integer: ");
    int num = scn.nextInt();
     int N = num / 2;

    // pyramid pattern
    for (int row = 0; row < N; row++) {
      for (int col = 0; col < N - row - 1; col++) {
        if (col < N - row - 1) {
          System.out.print("  ");
        }
      }
      for (int col = 0; col < row + 1; col++) {
        System.out.print("*   ");
      }
      System.out.println();
    }

    // inverted pyramid pattern
    for (int row = 0; row < N; row++) {
      for (int col = 0; col < row; col++) {
        System.out.print("  ");
      }

      for (int col = 0; col < N - row; col++) {
        System.out.print("*   ");
      }
      System.out.println();
    }
  }
}
