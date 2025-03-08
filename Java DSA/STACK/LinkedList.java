package STACK;

// to create a stack using Linked List

public class LinkedList {
  static class Node {
    int data;
    Node next;

    Node(int data, Node next) {
      this.data = data;
      this.next = null;
    }
  }

  static class Stack {
    static Node head = null;

    // to check the stack is empty or not

    public static boolean isEmpty() {
      return head == null;
    }

    // push operation

    public static void push(int data) {
      Node newNode = new Node(data, head);
      if (isEmpty()) {
        head = newNode;
        return;
      }
      newNode.next = head;
      head = newNode;
    }

    // pop operation

    public static int pop() {
      if (isEmpty()) {
        return -1;
      }
      int top = head.data;
      head = head.next;
      return top;
    }

    // peek operation

    public static int peek() {
      if (isEmpty()) {
        return -1;
      }
      int top = head.data;
      return top;
    }

  }

  public static void main(String[] args) {

    Stack s = new Stack();

    s.push(1);
    s.push(2);
    s.push(3);

    System.out.println();

    while (!s.isEmpty()) {
      System.out.println();
      System.out.println(s.peek());
      s.pop();
    }

  }
}