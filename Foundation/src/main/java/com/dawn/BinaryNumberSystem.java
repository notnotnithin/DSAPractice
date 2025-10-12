package com.dawn;

public class BinaryNumberSystem {

    static void main(String[] args) {
        String num1 = IO.readln("Enter a positive decimal number: ");
        IO.println(decimalToBinaryUsingDivisionMethod(Integer.parseInt(num1)));
        IO.println(decimalToBinaryUsingBitwiseMethod(Integer.parseInt(num1)));

        String num2 = IO.readln("Enter a binary number: ");
        IO.println(binaryToDecimalUsingDivisionMethod(Integer.parseInt(num2)));
        IO.println(binaryToDecimalUsingBitwiseMethod(Integer.parseInt(num2)));
    }

    private static int decimalToBinaryUsingDivisionMethod(int num) {
        int binaryNum = 0;
        int i = 0;
        while (num > 0) {
            int bit = num % 2;
            binaryNum = (int) (bit * Math.pow(10, i) + binaryNum);
            num = num / 2;
            i = i + 1;
        }
        return binaryNum;
    }

    private static int decimalToBinaryUsingBitwiseMethod(int num) {
        int binaryNum = 0;
        int i = 0;
        while (num > 0) {
            int bit = num & 1;
            binaryNum = (int) (bit * Math.pow(10, i) + binaryNum);
            num = num >> 1;
            i = i + 1;
        }
        return binaryNum;
    }

    private static int binaryToDecimalUsingDivisionMethod(int num) {
        int decimal = 0;
        int i = 0;
        while (num > 0) {
            int bit = num % 10;
            decimal = (int) (bit * Math.pow(2, i) + decimal);
            num = num / 10;
            i = i + 1;
        }
        return decimal;
    }

    private static int binaryToDecimalUsingBitwiseMethod(int num) {
        int decimal = 0;
        int i = 0;
        while (num > 0) {
            int bit = num & 1;
            decimal = decimal + (bit << i);
            num = num / 10;
            i = i + 1;
        }
        return decimal;
    }
}
