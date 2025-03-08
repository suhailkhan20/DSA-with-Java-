package LINKEDLIST;

public class Mergesort {

  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public Node head;
  public Node tail;

  public void addFirst(int data) {

    // step 1 - To create the new node
    Node newNode = new Node(data);
    // size++;

    if (head == null) {
      head = tail = newNode;
      return;
    }

    // step 2 - newNode next = head

    newNode.next = head; // link

    // step 3 - head = newNode

    head = newNode;
  }

  public void print() {

    if (head == null) {
      System.out.print("Linked list is Null");
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "--> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  // To Apply Merge Sort in the linked list //

  public Node getmid(Node head) {
    Node slow = head;
    Node fast = head.next;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow; // this is my mid node
  }

  public Node mergesort(Node head1, Node head2) {
    Node mergedLL = new Node(-1);
    Node temp = mergedLL;

    while (head1 != null && head2 != null) {
      if (head1.data <= head2.data) {
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
      } else {
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
      }
    }

    while (head1 != null) {
      temp.next = head1;
      head1 = head1.next;
      temp = temp.next;
    }

    while (head2 != null) {
      temp.next = head1;
      head2 = head2.next;
      temp = temp.next;
    }

    return mergedLL.next;
  }

  public Node mergesort(Node head) {

    if (head == null || head.next == null) {
      return head;
    }

    // find mid

    Node mid = getmid(head);

    // left & right MS

    Node righthead = mid.next;
    mid.next = null;

    // to call the merge sort

    Node newleft = mergesort(head);
    Node newright = mergesort(righthead);

    return mergesort(newleft, newright);
  }

  public static void main(String[] args) {

    Mergesort LL = new Mergesort();

    LL.addFirst(1);
    LL.addFirst(3);
    LL.addFirst(2);
    LL.addFirst(5);
    LL.addFirst(4);

    LL.print();

    LL.head = LL.mergesort(LL.head);

    LL.print();

  }
}
