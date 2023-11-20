package com.dawn;

import java.util.Scanner;

public class BenjaminBulbs {

  public static void main(String[] args) {
    System.out.print("Please enter a number: ");
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    benjaminBulbs(n);
  }

  private static void benjaminBulbs(int n) {
    for (int i = 1; i * i <= n; i++) {
      System.out.println(i * i);
    }
  }
}
