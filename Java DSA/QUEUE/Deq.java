package QUEUE;

import java.util.*;

public class Deq {
  public static void main(String[] args) {
    Deque<Integer> dq = new LinkedList<>();

    System.out.println();

    dq.addFirst(1);
    dq.addFirst(2);
    System.out.println(dq + " ");
    dq.addLast(3);
    dq.addLast(4);
    System.out.println(dq + " ");
    dq.removeFirst();
    dq.removeLast();
    System.out.println(dq + " ");
  }
}
