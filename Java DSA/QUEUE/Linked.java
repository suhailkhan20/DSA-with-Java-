package QUEUE;

public class Linked {
  static class Node {

    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  static class Queue {

    static Node head = null;
    static Node tail = null;

    public static boolean isEmpty() {
      return head == null && tail == null;
    }

    // to add the data in the queue

    public static void add(int data) {
      Node newNode = new Node(data);
      if (head == null) {
        head = tail = newNode;
        return;
      }
      tail.next = newNode;
      tail = newNode;
    }

    // to remove the data from the queue

    public static int remove() {
      if (isEmpty()) {
        System.out.println("Queue is Empty it's size is ");
        return -1;
      }
      int front = head.data;
      // single element
      if (tail == head) {
        tail = head = null;
      } else {
        head = head.next;
      }
      return front;
    }

    // to get the front element of the queue or peek the element

    public static int peek() {
      if (isEmpty()) {
        System.out.println("Queue is empty");
        return -1;
      }
      return head.data;

    }

  }

  public static void main(String[] args) {
    Queue q = new Queue();
    System.out.println();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.add(6);

    System.out.println();

    while (!q.isEmpty()) {

      // q.peek();
      System.out.println(q.peek());
      q.remove();
    }

  }
}
