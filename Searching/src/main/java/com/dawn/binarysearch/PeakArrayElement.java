package com.dawn.binarysearch;

public class PeakArrayElement {

    static void main() {
        int[] a = {10,20,30,90,70,60,50,40,30};
        int peakElement = PeakArrayElement.searchPeakElement(a);
        IO.println("Peak element in the array is at index: " + peakElement);
    }

    public static int searchPeakElement(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        int m;

        while (s < e) {
            m = s + (e - s) / 2;
            if (arr[m] < arr[m + 1]) {
                s = m + 1;
            } else {
                e = m;
            }
        }
        return s;
    }
}
