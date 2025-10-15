package com.dawn;

public class BitwiseOperators {

    static void main() {
        int a = Integer.parseInt(IO.readln("Enter number 1: "));
        int b = Integer.parseInt(IO.readln("Enter number 2: "));

        System.out.println("Bitwise & of two numbers");
        IO.println(a & b);
        System.out.println("Bitwise | of two numbers");
        IO.println(a | b);
        System.out.println("Bitwise ~ of a number");
        IO.println(~a);
        IO.println((~a));
        IO.println(~(a));

        IO.println(a ^ b);
    }
}
