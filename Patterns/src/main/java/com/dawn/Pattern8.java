package com.dawn;

import java.util.Scanner;

public class Pattern8 {

  public static void main(String[] args) {
    System.out.println("Full pyramid pattern: ");
    Scanner scn = new Scanner(System.in);
    System.out.println("Input an integer: ");
    int N = scn.nextInt();

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
  }
}
