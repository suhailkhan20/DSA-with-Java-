package LINKEDLIST;

public class DoubleLL {
  public class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
      this.data = data;
      this.next = null;
      this.prev = null;
    }
  }

  public static Node head;
  public static Node tail;
  public static int size;

  // add function

  // step 1 - To create the new node
  // step 2 - newNode next = head
  // step 3 - head = newNode

  public void addFirst(int data) {

    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head.prev = newNode;
    head = newNode;

  }

  // print the linked list

  public void print() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " <-->");
      temp = temp.next;
    }
    System.out.println("null");
  }

  // remove function

  public void remove() {
    if (head == null) {
      return;
    }
    if (size == 1) {
      head = head.next;
      // head.prev = null;
      size--;
    } else {
      head = head.next;
      head.prev = null;
      size--;
    }
  }

  // To Reverse the linked list

  public void Reverse() {
    Node curr = head;
    Node prev = null;
    Node next;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      curr.prev = next;
      prev = curr;
      curr = next;
    }
    head = prev;
  }

  public static void main(String[] args) {
    DoubleLL dl = new DoubleLL();

    dl.addFirst(5);
    dl.addFirst(4);
    dl.addFirst(3);
    dl.addFirst(2);
    dl.addFirst(1);

    dl.print();
    System.out.println("Size of Double Linked List " + size);
    // dl.remove();
    // dl.print();
    // System.out.println("Size of Double Linked List " + size);
    dl.Reverse();
    dl.print();
  }

}
