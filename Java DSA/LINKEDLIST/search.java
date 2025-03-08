package LINKEDLIST;

public class search {

  public class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;
  public static int size;

  public void addFirst(int data) {
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  public void print() {
    if (head == null) {
      System.out.println("Linked list is null.");
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "-->");
      temp = temp.next;
    }
  }

  public static void main(String[] args) {
    search sl = new search();
    sl.addFirst(5);
    sl.addFirst(4);
    sl.addFirst(8);
    sl.addFirst(9);
    sl.print();
  }
}
