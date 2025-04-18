package STACK;

import java.util.Stack;

public class Reverse {

  public static void pushAtBottom(Stack<Integer> s, int data) {
    if (s.isEmpty()) {
      s.push(data);
      return;
    }

    int top = s.pop();
    pushAtBottom(s, data);
    s.push(top);
  }

  public static void reverse(Stack<Integer> s) {
    if (s.isEmpty()) {
      return;
    }
    int top = s.pop();
    reverse(s);
    pushAtBottom(s, top);
  }

  public static void print(Stack<Integer> s) {
    while (!s.isEmpty()) {
      System.out.println(s.pop());
    }
  }

  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();

    s.push(1);
    s.push(3);
    s.push(4);
    s.push(5);

    // print();
    System.out.println();
    // System.out.println(s.pop());
    reverse(s);
    print(s);

  }
}
