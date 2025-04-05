package QUEUE;

import java.util.*;

public class JCollectionF {
  public static void main(String[] args) {
    // Queue<Integer> q = new LinkedList<>();

    // OR

    Queue<Integer> q = new ArrayDeque<>();

    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);

    System.out.println();
    System.out.println("Queue using Java Collection Framworks");

    while (!q.isEmpty()) {
      System.out.println(q.peek());
      q.remove();
    }
  }
}
