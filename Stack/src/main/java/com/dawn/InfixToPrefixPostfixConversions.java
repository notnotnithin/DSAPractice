package com.dawn;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPrefixPostfixConversions {

  public static void main(String[] args) {
    System.out.print("Please enter an infix expression: ");
    Scanner scn = new Scanner(System.in);
    String infix = scn.next();
    conversion(infix);
  }

  private static void conversion(String infix) {
    Stack<String> prefix = new Stack<>();
    Stack<String> postfix = new Stack<>();
    Stack<Character> operators = new Stack<>();

    for (int i = 0; i < infix.length(); i++) {
      char ch = infix.charAt(i);
      if (ch == '(') {
        operators.push(ch);
      } else if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
        prefix.push(ch + "");
        postfix.push(ch + "");
      } else if (ch == ')') {
        while (operators.peek() != '(') {
          char op = operators.pop();
          String prev2 = prefix.pop();
          String prev1 = prefix.pop();
          String preval = op + prev1 + prev2;
          prefix.push(preval);

          String postv2 = postfix.pop();
          String postv1 = postfix.pop();
          String postval = postv1 + postv2 + op;
          postfix.push(postval);
        }
        operators.pop();
      } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
        while (!operators.isEmpty() &&
            operators.peek() != '(' &&
            precedence(ch) <= precedence(operators.peek())) {
          char op = operators.pop();
          String prev2 = prefix.pop();
          String prev1 = prefix.pop();
          String preval = op + prev1 + prev2;
          prefix.push(preval);

          String postv2 = postfix.pop();
          String postv1 = postfix.pop();
          String postval = postv1 + postv2 + op;
          postfix.push(postval);
        }
        operators.push(ch);
      }
    }

    while (!operators.isEmpty()) {
      char op = operators.pop();
      String prev2 = prefix.pop();
      String prev1 = prefix.pop();
      String preval = op + prev1 + prev2;
      prefix.push(preval);

      String postv2 = postfix.pop();
      String postv1 = postfix.pop();
      String postval = postv1 + postv2 + op;
      postfix.push(postval);
    }
    System.out.println("Prefix conversion would be: " + prefix.peek());
    System.out.println("Postfix conversion would be: " + postfix.peek());
  }

  private static int precedence(char op) {
    if (op == '+' || op == '-') {
      return 1;
    } else if (op == '/' || op == '*') {
      return 2;
    } else {
      // Adding to satisfy compiler. Unused block.
      return 0;
    }
  }
}
