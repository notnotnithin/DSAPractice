package com.dawn;

import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluationAndConversions {

  public static void main(String[] args) {
    System.out.print("Please enter an postfix expression: ");
    Scanner scn = new Scanner(System.in);
    String postfix = scn.next();
    conversion(postfix);
  }

  private static void conversion(String postfix) {
    Stack<Integer> values = new Stack<>();
    Stack<String> infix = new Stack<>();
    Stack<String> prefix = new Stack<>();

    for (int i = 0; i < postfix.length(); i++) {
      char ch = postfix.charAt(i);
      if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
        int v2 = values.pop();
        int v1 = values.pop();
        int val = operation(v1, v2, ch);
        values.push(val);

        String inVal2 = infix.pop();
        String inVal1 = infix.pop();
        String inVal = "(" + inVal1 + ch + inVal2 + ")";
        infix.push(inVal);

        String prVal2 = prefix.pop();
        String prVal1 = prefix.pop();
        String prVal = ch + prVal1 + prVal2;
        prefix.push(prVal);
      } else {
        values.push(ch - '0');
        infix.push(ch + "");
        prefix.push(ch + "");
      }
    }
    System.out.println("Postfix expression value - " + values.peek());
    System.out.println("Infix expression - " + infix.peek());
    System.out.println("Prefix expression - " + prefix.peek());
  }

  private static int operation(int v1, int v2, char op) {
    if (op == '+') {
      return v1 + v2;
    } else if (op == '-') {
      return v1 - v2;
    } else if (op == '*') {
      return v1 * v2;
    } else {
      return v1 / v2;
    }
  }
}
