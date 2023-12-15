package com.dawn;

import java.util.Scanner;

public class Pattern19 {

  public static void main(String[] args) {
    System.out.println("Numeric palindrome equilateral pyramid pattern:");
    Scanner scn = new Scanner(System.in);
    System.out.println("Input an integer: ");
    int N = scn.nextInt();

    /**
     *
     *
     *  	 1
     *    121
     *   12321
     *  1234321
     * 123454321
     *
     *
     */

    int k = 1;
    for (int row = 1; row <= N; row++) {
      for (int col = 1; col <= N - row; col++) {
        System.out.print(" ");
      }

      k = 1;
      for (int col = 1; col <= row; col++) {
        System.out.print(k);
        k++;
      }

      int r = 1;
      for (int col = 1; col < row; col++) {
        System.out.print(r);
        r++;
      }
      System.out.println();
    }
  }
}
