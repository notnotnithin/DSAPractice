package com.dawn;

import java.util.Arrays;
import java.util.Stack;

public class GreatestElementToRightApproach2 {

  public static void main(String[] args) {
    int[] elements = {2, 5, 9, 3, 1, 12, 6, 8, 7};
    System.out.println("The next greater element for the array is: "
        + Arrays.toString(greatestElementToRight(elements)));
  }

  private static int[] greatestElementToRight(int[] arr) {
    int[] nge = new int[arr.length];
    Stack<Integer> st = new Stack<>();

    st.push(0);
    for (int i = 1; i < arr.length; i++) {
      while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
        int pos = st.peek();
        nge[pos] = arr[i];
        st.pop();
      }
      st.push(i);
    }

    while (!st.isEmpty()) {
      int pos = st.peek();
      nge[pos] = -1;
      st.pop();
    }
    return nge;
  }
}