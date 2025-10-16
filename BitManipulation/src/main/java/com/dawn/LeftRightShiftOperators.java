package com.dawn;

public class LeftRightShiftOperators {

    static void main() {
        int a = Integer.parseInt(IO.readln("Enter a number: "));

        System.out.println("Left shift of a number by 1");
        IO.println((a << 1));
        System.out.println("Left shift of a number by 2");
        IO.println((a << 2));

        System.out.println("Right shift of a number by 1");
        IO.println((a >> 1));
        System.out.println("Right shift of a number by 2");
        IO.println((a >> 2));

        System.out.println("Unsigned right shift of a number by 1");
        IO.println((a >>> 1));
        System.out.println("Unsigned right shift of a number by 2");
        IO.println((a >>> 2));

        System.out.println("Left shift of a number by -1");
        IO.println((a << -1));
        System.out.println("Left shift of a number by -2");
        IO.println((a << -2));
    }
}
