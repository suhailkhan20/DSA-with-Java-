package QUEUE;

public class Array {
  static class Queue {
    static int arr[];
    static int size, rear, front;

    Queue(int n) {
      size = n;
      rear = -1;
      arr = new int[size];
    }

    public static boolean isEmpty() {
      return rear == -1;
    }

    // to add the data in the queue

    public static void add(int data) {
      if (rear == size - 1) {
        System.out.println("Queue is full");
        return;
      } else {
        rear = rear + 1;
        arr[rear] = data;
        // System.out.println("Added element is: " + data);
      }
    }

    // to remove the data from the queue

    public static int remove() {
      if (isEmpty()) {
        System.out.println("Queue is Empty it's size is " + size);
        return -1;
      }
      int front = arr[0];
      for (int i = 0; i < rear; i++) {
        arr[i] = arr[i + 1];
      }
      rear = rear - 1;
      // System.out.println("Removed element is: " + front);
      return front;
    }

    // to get the front element of the queue or peek the element

    public static int peek() {
      if (isEmpty()) {
        System.out.println("Queue is empty");
        return -1;
      }
      return arr[0];

    }

  }

  public static void main(String[] args) {
    Queue q = new Queue(5);
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
