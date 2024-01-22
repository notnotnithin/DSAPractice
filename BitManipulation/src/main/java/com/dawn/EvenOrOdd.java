package com.dawn;

import java.util.Scanner;

public class EvenOrOdd {

  public static void main(String[] args) {
    System.out.println("Check if a number is even or odd:");
    Scanner scn = new Scanner(System.in);
    System.out.println("Input an integer: ");
    int N = scn.nextInt();
    System.out.println(checkEvenOrOdd(N) ? "Even number" : "Odd number");
  }

  private static boolean checkEvenOrOdd(int N) {
    return (N & 1) == 0;
  }
}