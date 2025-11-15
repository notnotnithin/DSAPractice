package com.dawn.binarysearch;

public class PivotElement {

    static void main() {
        int[] a = {12, 14, 16, 2, 4, 6, 8, 10};
        int pivotElement = PivotElement.findPivotIndex(a);
        IO.println("Peak element in the array is at index: " + pivotElement);
    }

    public static int findPivotIndex(int[] a) {
        int s = 0;
        int n = a.length;
        int e = n - 1;

        int m;

        while (s <= e) {
            m = s + (e - s) / 2;

            if (s == e) return s;

            if (a[m] < a[m - 1])
                return m - 1;
            else if (a[m] > a[m + 1])
                return m;
            else if (a[m] < a[s])
                s = m + 1;
            else
                e = m - 1;

        }
        return -1;
    }
}
