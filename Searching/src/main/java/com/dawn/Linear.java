package com.dawn;

public class Linear {

    static void main() {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        String target = IO.readln("Enter an integer: ");
        boolean isFound = search(arr, Integer.parseInt(target));
        if (isFound) {
            IO.println("Element found!");
        } else {
            IO.println("Element not found!");
        }
    }

    private static boolean search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
