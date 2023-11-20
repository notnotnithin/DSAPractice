package com.dawn;

import java.util.Scanner;

public class PrimeFactors {

  public static void main(String[] args) {
    System.out.print("Please enter a number: ");
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println("The prime factors of number " + n + " are: ");
    primeFactors(n);
  }

  private static void primeFactors(int n) {
    for (int dsr = 2; dsr * dsr <= n; dsr++) {
      while (n % dsr == 0) {
        n = n / dsr;
        System.out.print(dsr + " ");
      }
    }

    if (n != 1) {
      System.out.print(n);
    }
  }
}
