package QUEUE;

import java.util.*;

public class Reversal {

  public static void reverse(Queue<Integer> q) {
    Stack<Integer> st = new Stack<Integer>();

    while (!q.isEmpty()) {
      st.push(q.remove());
    }

    while (!st.isEmpty()) {
      q.add(st.pop());
    }
  }

  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();

    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);

    System.out.println();

    reverse(q);

    while (!q.isEmpty()) {
      System.out.print(q.remove() + " ");
    }
  }
}
