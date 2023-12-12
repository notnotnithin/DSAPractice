package com.dawn;

public class Pattern3 {

  public static void main(String[] args) {
    System.out.println("Numeric Half Pyramid Pattern");
    int n = 5;

    for (int row = 0; row < n; row++) {
      for (int col = 0; col < row + 1; col++) {
        System.out.print((col + 1) + " ");
      }
      System.out.println();
    }
  }
}
