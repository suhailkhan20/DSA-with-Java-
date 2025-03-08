package LINKEDLIST;

public class detectCycle {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;

  public void addfirst(int data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = tail = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;
  }

  public void print() {

    if (head == null) {
      System.out.print("Linked list is Null");
    }

    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "-->");
      temp = temp.next;
    }
    System.out.println(" Null");
  }

  public boolean detectToCycle() {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) {
        System.out.print("Is a cycle forming in the linked list.-->  ");
        return true;
      }
    }
    System.out.print("Is a cycle forming in the linked list.-->  ");
    return false;
  }

  public static void main(String[] args) {
    detectCycle LL = new detectCycle();

    // LL.addfirst(2);
    // LL.addfirst(3);
    // LL.addfirst(4);
    // LL.addfirst(5);
    // LL.addfirst(26);
    // LL.print();
    head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);
    head.next.next.next.next = head;

    System.out.println(LL.detectToCycle());
  }
}
