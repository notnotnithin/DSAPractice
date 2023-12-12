package com.dawn;

public class Pattern4 {

  public static void main(String[] args) {
    System.out.println("Inverted Numeric Half Pyramid Pattern");
    int n = 5;

    for (int row = 0; row < n; row++) {
      for (int col = 0; col < n - row; col++) {
        System.out.print((col + 1) + " ");
      }
      System.out.println();
    }
  }
}
