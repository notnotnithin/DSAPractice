package com.dawn;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {

  public static void main(String[] args) {
    int[] elements = {2, 5, 9, 3, 1, 12, 6, 8, 7};
    System.out.println("Stock span of the array is: "
        + Arrays.toString(stockSpan(elements)));
  }

  private static int[] stockSpan(int[] arr) {
    int[] span = new int[arr.length];
    Stack<Integer> st = new Stack<>();

    st.push(0);
    span[0] = 1;
    for (int i = 1; i < arr.length; i++) {
      while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
        st.pop();
      }
      if (st.isEmpty()) {
        span[i] = i + 1;
      } else {
        span[i] = i - st.peek();
      }
      st.push(i);
    }
    return span;
  }
}
