package com.dawn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class MergeOverlappingIntervals {

  public static class Pair implements Comparable<Pair> {

    int st;
    int et;

    Pair(int st, int et) {
      this.st = st;
      this.et = et;
    }

    @Override
    public int compareTo(Pair o) {
      if (this.st != o.st) {
        return this.st - o.st;
      } else {
        return this.et - o.et;
      }
    }
  }

  public static void main(String[] args) throws IOException {
    System.out.print("Please enter a number: ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[][] arr = new int[n][2];

    System.out.print("Please enter " + n + " pair of numbers separated by a space: ");
    for (int i = 0; i < n; i++) {
      String line = br.readLine();

      arr[i][0] = Integer.parseInt(line.split(" ")[0]);
      arr[i][1] = Integer.parseInt(line.split(" ")[0]);
    }
    mergeOverlappingIntervals(arr);
  }

  private static void mergeOverlappingIntervals(int[][] arr) {

    Pair[] pairs = new Pair[arr.length];
    for (int i = 0; i < arr.length; i++) {
      pairs[i] = new Pair(arr[i][0], arr[i][1]);
    }

    Arrays.sort(pairs);
    Stack<Pair> st = new Stack<>();
    for (int i = 0; i < pairs.length; i++) {
      if (i == 0) {
        st.push(pairs[i]);
      } else {
        Pair top = st.peek();
        if (pairs[i].st < top.st) {
          top.et = Math.max(top.et, pairs[i].et);
        } else {
          st.push(pairs[i]);
        }
      }
    }

    Stack<Pair> rs = new Stack<>();
    while (!st.isEmpty()) {
      rs.push(st.pop());
    }

    while (!rs.isEmpty()) {
      Pair p = rs.pop();
      System.out.println(p.st + " " + p.et);
    }
  }
}
