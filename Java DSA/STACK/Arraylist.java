package STACK;

import java.util.ArrayList;;

// to crete a stack using ArrayList 

public class Arraylist {

  static class Stack {
    static ArrayList<Integer> list = new ArrayList();

    // to check the stack is empty or not

    public static boolean isEmpty() {
      return list.size() == 0;
    }

    // push operation
    public static void push(int data) {
      list.add(data);
    }

    // pop operation
    public static int pop() {
      if (isEmpty()) {
        return -1;
      }
      int top = list.get(list.size() - 1);
      list.remove(list.size() - 1);
      return top;

    }
    // peek operation

    public static int peek() {
      if (isEmpty()) {
        return -1;
      }
      int top = list.get(list.size() - 1);
      return top;
    }

  }

  public static void main(String[] args) {

    Stack s = new Stack();
    s.push(5);
    s.push(4);
    s.push(3);
    s.push(2);
    s.push(1);

    System.out.println();

    while (!s.isEmpty()) {
      System.out.println();
      System.out.println(s.peek());
      s.pop();
    }

  }
}
