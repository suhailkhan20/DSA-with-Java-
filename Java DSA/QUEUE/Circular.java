package QUEUE;

public class Circular {
  static class Queue {
    static int arr[];
    static int size, rear, front;

    Queue(int n) {
      size = n;
      rear = -1;
      front = -1;
      arr = new int[size];
    }

    public static boolean isEmpty() {
      return rear == -1 && front == -1;
    }

    public static boolean isFull() {
      return (rear + 1) % size == front;
    }

    // to add the data in the queue

    public static void add(int data) {
      if (isFull()) {
        System.out.println("Queue is full");
        return;
      }
      if (front == -1) {
        front = 0;
      }
      rear = (rear + 1) % size;
      arr[rear] = data;
      // System.out.println("Added element is: " + data);

    }

    // to remove the data from the queue

    public static int remove() {
      if (isEmpty()) {
        System.out.println("Queue is Empty it's size is " + size);
        return -1;
      }
      int result = arr[front];
      if (front == rear) {
        front = rear = -1;
      } else {
        front = (front + 1) % size;
      }
      return result;
    }

    // to get the front element of the queue or peek the element

    public static int peek() {
      if (isEmpty()) {
        System.out.println("Queue is empty");
        return -1;
      }
      return arr[front];

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

    System.out.println(q.remove());
    q.add(8);
    System.out.println(q.remove());
    q.add(9);

    while (!q.isEmpty()) {

      // q.peek();
      System.out.println(q.peek());
      q.remove();
    }
  }
}
