package com.dawn;

import java.util.Scanner;

public class PythagoreanTriplets {

  public static void main(String[] args) {
    System.out.print("Please enter first number: ");
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();

    System.out.print("Please enter second number: ");
    int b = scn.nextInt();

    System.out.print("Please enter third number: ");
    int c = scn.nextInt();

    boolean isTriplet = pythagoreanTriplet(a, b, c);
    System.out.println(
        "Are " + a + ", " + b + ", and " + c + " a pythagorean triplet? - " + isTriplet);
  }

  private static boolean pythagoreanTriplet(int a, int b, int c) {
    int max = getMax(a, b, c);

    if (max == a) {
      return ((b * b) + (c * c) == (a * a));
    } else if (max == b) {
      return ((a * a) + (c * c) == (b * b));
    } else {
      return ((a * a) + (b * b) == (c * c));
    }
  }

  private static int getMax(int a, int b, int c) {
    int max = a;
    if (b >= max) {
      max = b;
    }
    if (c >= max) {
      max = c;
    }
    return max;
  }
}
