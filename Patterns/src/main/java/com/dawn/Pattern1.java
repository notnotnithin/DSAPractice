package com.dawn;

public class Pattern1 {

  public static void main(String[] args) {
    System.out.println("Half Pyramid Pattern!");
    int ROWS = 5;

    for (int i = 1; i <= ROWS; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}