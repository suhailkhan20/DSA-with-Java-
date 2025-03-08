package LINKEDLIST;

public class Palindrome {
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

  // Slow -- fast Approach.....

  public Node findMid(Node head) {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public boolean checkPalindrome() {
    if (head == null || head.next == null) {
      return true;
    }
    // step 1 -- find mid

    Node miNode = findMid(head);

    // step 2 -- reverse 2nd half

    Node prev = null;
    Node curr = miNode;
    Node next;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    Node right = prev; // right half head
    Node left = head;

    // step 3 -- check left == right

    while (right != null) {
      if (left.data != right.data) {
        return false;
      }
      left = left.next;
      right = right.next;
    }
    return true;
  }

  public static void main(String[] args) {
    Palindrome LL = new Palindrome();

    LL.addfirst(2);
    LL.addfirst(3);
    LL.addfirst(4);
    LL.addfirst(5);
    LL.addfirst(26);
    LL.checkPalindrome();

    LL.print();
  }
}
