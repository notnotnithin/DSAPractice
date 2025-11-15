package com.dawn.binarysearch;

public class SquareRootOfN {

    static void main() {
        double n = 68;
        double sqrtN = SquareRootOfN.findSquareRoot(n);
        IO.println("Square root of " + n + " is: " + sqrtN);
    }

    private static double findSquareRoot(double n) {
        double s = 0;
        double e = n;
        double ans = -1;
        double m;
        while (s <= e) {
            m = s + (e - s) / 2;

            if (m * m == n) {
                return m;
            } else if (m * m < n) {
                ans = m;
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return ans;
    }
}
