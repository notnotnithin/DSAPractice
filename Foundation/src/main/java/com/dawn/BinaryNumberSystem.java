package com.dawn;

public class BinaryNumberSystem {

    static void main(String[] args) {
        String num = IO.readln("Enter a positive number: ");
        IO.println(decimalToBinaryUsingDivisionMethod(Integer.parseInt(num)));
        IO.println(decimalToBinaryUsingBitwiseMethod(Integer.parseInt(num)));
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
}
