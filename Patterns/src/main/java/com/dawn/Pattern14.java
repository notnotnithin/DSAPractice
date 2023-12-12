package com.dawn;

import java.util.Scanner;

public class Pattern14 {

  public static void main(String[] args) {
    System.out.println("Hollow diamond pattern:");
    Scanner scn = new Scanner(System.in);
    System.out.println("Input an integer: ");
    int num = scn.nextInt();
    int N = num / 2;

    for (int row = 0; row < N; row++) {
      for (int col = 0; col < N - row - 1; col++) {
        System.out.print(" ");
      }

      for (int col = 0; col < row + 1; col++) {
        if (col == 0 || col == row) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
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
