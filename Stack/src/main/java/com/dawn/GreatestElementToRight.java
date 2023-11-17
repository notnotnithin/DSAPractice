package com.dawn;

import java.util.Arrays;
import java.util.Stack;

public class GreatestElementToRight {

  public static void main(String[] args) {
    int[] elements = {2, 5, 9, 3, 1, 12, 6, 8, 7};
    System.out.println("The next greater element for the array is: "
        + Arrays.toString(greatestElementToRight(elements)));
  }

  private static int[] greatestElementToRight(int[] arr) {
    int[] nge = new int[arr.length];
    Stack<Integer> st = new Stack<>();

    st.push(arr[arr.length - 1]);
    nge[arr.length - 1] = -1;

    for (int i = arr.length - 2; i >= 0; i--) {
      while (!st.isEmpty() && arr[i] >= st.peek()) {
        st.pop();
      }

      if (st.isEmpty()) {
        nge[i] = -1;
      } else {
        nge[i] = st.peek();
      }
      st.push(arr[i]);
    }
    return nge;
  }
}