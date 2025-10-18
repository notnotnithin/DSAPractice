package com.dawn;

public class IncrementAndDecrementOperators {

    static void main() {
        int a = Integer.parseInt(IO.readln("Enter a number: "));

        System.out.println("Post-increment of a number");
        IO.println(a++);
        System.out.println("Value of a after post-increment");
        IO.println(a);

        System.out.println("Pre-increment of a number");
        IO.println(++a);
        System.out.println("Value of a after pre-increment");
        IO.println(a);

        System.out.println("Post-decrement of a number");
        IO.println(a--);
        System.out.println("Value of a after post-decrement");
        IO.println(a);

        System.out.println("Pre-decrement of a number");
        IO.println(--a);
        System.out.println("Value of a after pre-decrement");
        IO.println(a);
    }
}
