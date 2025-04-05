package QUEUE;

import java.util.*;

public class QUseDQ {

  static class Queue {
    Deque<Integer> deque = new LinkedList<>();

    // To push the element in stack using deque
    public void add(int data) {
      deque.addLast(data);
    }

    public int remove() {
      return deque.removeFirst();
    }

    public int get() {
      return deque.getFirst();
    }
  }

  public static void main(String[] args) {

    Queue q = new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
    // s.push(4);

    System.out.println("Peek : " + q.get());
    System.out.println(q.remove());
    System.out.println(q.remove());
    System.out.println(q.remove());

  }
}
