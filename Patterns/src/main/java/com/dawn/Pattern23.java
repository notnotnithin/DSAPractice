package com.dawn;

import java.util.Scanner;

public class Pattern23 {

  public static void main(String[] args) {
    System.out.println("Butterfly pattern:");
    Scanner scn = new Scanner(System.in);
    System.out.println("Input an integer: ");
    int N = scn.nextInt();

    for (int row = 0; row < N; row++) {
      for (int col = 0; col < row + 1; col++) {
        System.out.print("*");
      }

      for (int col = 0; col < 2 * N - 2 * row - 2; col++) {
        System.out.print(" ");
      }

      for (int col = 0; col < row + 1; col++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int row = 0; row < N; row++) {
      for (int col = 0; col < N - row; col++) {
        System.out.print("*");
      }

      for (int col = 0; col < 2 * N + 2 * row - 8; col++) {
        System.out.print(" ");
      }

      for (int col = 0; col < N - row; col++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
