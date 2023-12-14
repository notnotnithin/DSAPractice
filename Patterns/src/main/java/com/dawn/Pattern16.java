package com.dawn;

import java.util.Scanner;

public class Pattern16 {

  public static void main(String[] args) {
    System.out.println("Numbers and Stars pattern:");
    Scanner scn = new Scanner(System.in);
    System.out.println("Input an integer: ");
    int N = scn.nextInt();

    for (int row = 0; row < N; row++) {
      for (int col = 0; col < 2 * row + 1; col++) {
        if (col % 2 == 0) {
          System.out.print(row + 1);
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}
