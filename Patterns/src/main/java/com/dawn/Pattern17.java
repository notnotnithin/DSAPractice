package com.dawn;

import java.util.Scanner;

public class Pattern17 {

  public static void main(String[] args) {
    System.out.println("Alphabetical pattern:");
    Scanner scn = new Scanner(System.in);
    System.out.println("Input an integer: ");
    int N = scn.nextInt();

    char ch = '0';
    for (int row = 0; row < N; row++) {
      for (int col = 0; col < row; col++) {
        ch = (char) (col + 1 + 'A' - 1);
        System.out.print(ch);
      }
      for (char alphabet = ch; alphabet > 'A'; ) {
        alphabet = (char) (alphabet - 1);
        System.out.print(alphabet);
      }
      System.out.println();
    }
  }
}
