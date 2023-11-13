package com.dawn;

import java.util.Scanner;

public class RotateNumber {

  public static void main(String[] args) {
    System.out.print("Please enter a number: ");
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    System.out.print("Please enter a number to rotate: ");
    int k = scn.nextInt();
    System.out.println("Number after rotating is: " + rotate(n, k));
  }

  private static int rotate(int n, int k) {
    int digCount = countDigits(n);

    k = k % 10;
    if (k < 0) {
      k = k + digCount;
    }

    int dsr = 1;
    int mul = 1;
    for (int i = 1; i <= digCount; i++) {
      if (i <= k) {
        dsr = dsr * 10;
      } else {
        mul = mul * 10;
      }
    }

    int quot = n / dsr;
    int rem = n % dsr;

    return rem * mul + quot;
  }

  private static int countDigits(int n) {
    int temp = n;
    int nod = 0;
    while (temp > 0) {
      temp = temp / 10;
      nod++;
    }
    return nod;
  }
}
