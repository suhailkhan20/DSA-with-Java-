package STACK;

import java.util.Stack;

public class NextGreaterEle {
  public static void main(String[] args) {
    int arr[] = { 10, 5, 4, 2, 6, 8, 3, 1 };
    Stack<Integer> s = new Stack<>();
    int nextGreater[] = new int[arr.length];

    for (int i = arr.length - 1; i >= 0; i--) {
      while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
        s.pop();
      }
      if (s.isEmpty()) {
        nextGreater[i] = -1;
      } else {
        nextGreater[i] = arr[s.peek()];
      }
      s.push(i);
    }
    System.out.println();
    for (int i = 0; i < nextGreater.length; i++) {
      System.out.println(nextGreater[i] + " ");
    }
    System.out.println();
  }
}
