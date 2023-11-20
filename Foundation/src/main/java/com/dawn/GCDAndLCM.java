package com.dawn;

import java.util.Scanner;

public class GCDAndLCM {

  public static void main(String[] args) {
    System.out.print("Please enter first number: ");
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    System.out.print("Please enter second number: ");
    int n2 = scn.nextInt();
    findGCDLCM(n1, n2);
  }

  private static void findGCDLCM(int n1, int n2) {
    int on1 = n1;
    int on2 = n2;
    while (n1 % n2 != 0) {
      int rem = n1 % n2;
      n1 = n2;
      n2 = rem;
    }
    int gcd = n2;
    System.out.println("GCD is: " + gcd);
    System.out.println("LCM is: " + (on1 * on2) / gcd);
  }
}
