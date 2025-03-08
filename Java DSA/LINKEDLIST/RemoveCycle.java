package LINKEDLIST;

public class RemoveCycle {
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

  // steps for to removing the cycle forming.....

  // step 1 - detect cycle that is cycle is forming or not.
  // step 2 - slow = head .. to initialize the slow to head.
  // step 3 - initialize prev = null.
  // step 4 - loop (slow == fast)
  // step 5 - to break the cycle .. prev.next = null

  public void toRemoveCycle() {

    Node slow = head;
    Node fast = head;
    boolean cycle = false;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      // steps for to removing the cycle forming.....

      // step 1 - detect cycle that is cycle is forming or not.
      if (slow == fast) {
        cycle = true;
        break;
      }
    }
    if (cycle == false) {
      return;
    }

    // step 2 - slow = head .. to initialize the slow to head.

    slow = head;

    // step 3 - initialize prev = null.
    Node prev = null;
    // step 4 - loop (slow == fast)
    while (slow != fast) {
      prev = fast;
      slow = slow.next;
      fast = fast.next;
    }
    // step 5 - to break the cycle .. prev.next = null
    prev.next = null;
    System.out.println(" Now linked list is not form a Cycle");
  }

  public static void main(String[] args) {
    RemoveCycle LL = new RemoveCycle();

    head = new Node(1);
    Node temp = new Node(2);
    head.next = temp;
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);
    head.next.next.next.next.next = temp;
    // System.out.println(LL.toRemoveCycle());
    LL.toRemoveCycle();
  }
}
