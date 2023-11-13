package com.dawn;

import java.util.Scanner;

public class InverseOfNumber {

  public static void main(String[] args) {
    System.out.print("Please enter a number: ");
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    System.out.println("Inverse of number " + n + " is: " + inverse(n));
  }

  private static int inverse(int n) {
    int inverse = 0;
    int origPos = 1;
    while (n > 0) {
      int origDig = n % 10;
      int invDig = origPos;
      int invPos = origDig;

      inverse = (int) (inverse + invDig * Math.pow(10, invPos - 1));

      n = n / 10;
      origPos++;
    }
    return inverse;
  }
}