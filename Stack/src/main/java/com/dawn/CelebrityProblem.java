package com.dawn;

import java.util.Stack;

public class CelebrityProblem {

  public static void main(String[] args) {
    int[][] arr = {
        {0, 1, 1, 1, 1},
        {1, 0, 0, 1, 0},
        {1, 0, 0, 1, 0},
        {0, 0, 0, 0, 0},
        {0, 1, 0, 1, 0}
    };

    int celebrity = findCelebrity(arr);
    System.out.println("Celebrity is: " + celebrity);
  }

  private static int findCelebrity(int[][] arr) {
    Stack<Integer> st = new Stack<>();

    for (int i = 0; i < arr.length; i++) {
      st.push(i);
    }

    while (st.size() >= 2) {
      int v2 = st.pop();
      int v1 = st.pop();

      if (arr[v1][v2] == 1) {
        // if v1 knows v2, then v1 can't be a celebrity
        st.push(v2);
      } else {
        // if v2 knows v1, then v2 can't be a celebrity
        st.push(v1);
      }
    }
    int pot = st.pop();
    for (int i = 0; i < arr.length; i++) {
      // skip for 2,2 assuming 2 is a potential celebrity and check for others
      if (i != pot) {
        // if there exists a cell where other don't know potential celebrity or
        // the potential celebrity knows anyone then the potential celebrity cannot
        // be a celebrity.
        if (arr[i][pot] == 0 || arr[pot][i] == 1) {
          return -1;
        }
      }
    }
    return pot;
  }
}
