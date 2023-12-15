package com.dawn;

import java.util.Scanner;

public class Pattern20 {

  public static void main(String[] args) {
    System.out.println("Stars and numeric solid triangle pattern:");
    Scanner scn = new Scanner(System.in);
    System.out.println("Input an integer: ");
    int N = scn.nextInt();

    /**
     *
     * ********1********
     * *******2*2*******
     * ******3*3*3******
     * *****4*4*4*4*****
     * ****5*5*5*5*5****
     */

    for (int row = 0; row < N; row++) {
      for (int col = 0; col < 2 * N - 2 - row; col++) {
        System.out.print("*");
      }

      for (int col = 0; col < 2 * row + 1; col++) {
        if (col % 2 == 0) {
          System.out.print(row + 1);
        } else {
          System.out.print("*");
        }
      }

      for (int col = 0; col < 2 * N - 2 - row; col++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
