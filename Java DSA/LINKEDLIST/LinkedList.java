package LINKEDLIST;

public class LinkedList {

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
  public static int size;

  // To Add the element in the first position

  public void addFirst(int data) {

    // step 1 - To create the new node
    Node newNode = new Node(data);
    size++;

    if (head == null) {
      head = tail = newNode;
      return;
    }

    // step 2 - newNode next = head

    newNode.next = head; // link

    // step 3 - head = newNode

    head = newNode;
  }

  // To Add the element in the last element

  public void addlast(int data) {

    // same steps for to add the element at the last

    Node newNode = new Node(data);
    size++;
    if (head == null) {
      tail = head = newNode;
      return;
    }

    tail.next = newNode;

    tail = newNode;
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

  public void add(int idx, int data) {
    if (idx == 0) {
      addFirst(data);
      return;
    }
    Node newNode = new Node(data);
    size++;
    Node temp = head;
    int i = 0;

    while (i < idx - 1) {
      temp = temp.next;
      i++;
    }

    // i = idx-1; temp->prev

    newNode.next = temp.next;
    temp.next = newNode;
  }

  // To remove the element in list

  public int removefirst() {
    int val;

    if (size == 0) {
      System.out.println("The list is empty.");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }

    val = head.data;
    head = head.next;
    size--;
    return val;
  }

  public int removelast() {

    int val;
    if (size == 0) {
      System.out.println("The list is empty.");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }

    Node prev = head;

    for (int i = 0; i < size - 2; i++) {
      prev = prev.next;
    }
    val = tail.data;
    prev.next = null;
    tail = prev;
    size--;
    return val;

  }

  public int search(int key) {
    Node temp = head;
    int i = 1;
    while (temp != null) {
      if (temp.data == key) {
        return i;
      }
      temp = temp.next;
      i++;
    }
    System.out.println(key + " is not found in the list.");
    return -1;
  }

  // search the element using recursion

  public int helper(Node head, int key) {
    if (head == null) {
      return -1;
    }
    if (head.data == key) {
      return 0;
    }
    int idx = helper(head.next, key);
    if (idx == -1) {
      return -1;
    }
    return idx + 1;
  }

  public int recSearch(int key) {
    return helper(head, key);
  }

  public static void main(String[] args) {
    LinkedList LL = new LinkedList();

    LL.addFirst(2);
    // LL.print();
    LL.addFirst(1);
    // LL.print();
    LL.addlast(3);
    // LL.print();
    LL.addlast(4);
    LL.add(4, 9);
    LL.print();
    // System.out.println("After remove one node.");
    // LL.removefirst();
    // LL.print();
    // LL.removelast();
    // LL.print();
    System.out.println(LL.recSearch(3));
    System.out.println(LL.recSearch(8));

    LL.print();

    System.out.println(LL.size);

  }

}
