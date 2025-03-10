package LINKEDLIST;

public class Reverse {

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

  public void Reverse() {
    Node prev = null;
    Node curr = tail = head;
    Node next;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
  }

  public void deleteNthfromEnd(int n) {
    // To calculate the size of the list

    int sz = 0;
    Node temp = head;
    while (temp != null) {
      temp = temp.next;
      sz++;
    }

    if (n == sz) {
      head = head.next;
      return;
    }

    int i = 1;
    int iToFind = sz - n;
    Node prev = head;
    while (i < iToFind) {
      prev.next = prev.next.next;
      return;

    }
  }

  public static void main(String[] args) {
    Reverse LL = new Reverse();

    LL.addfirst(2);
    LL.addfirst(3);
    LL.addfirst(4);
    LL.addfirst(5);
    LL.addfirst(26);
    // LL.Reverse();
    LL.deleteNthfromEnd(2);
    LL.print();
  }
}