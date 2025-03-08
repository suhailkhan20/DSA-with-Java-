package LINEAR;

import java.util.*;

public class reverseAlgo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the Array: ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.print("Enter the Elements of the Array: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.print("Enter the number of elements to reverse: ");
    int k = sc.nextInt();
    System.out.println("Your Desired Array is ");
    for (int i = arr.length - k; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    int j = 0;
    for (int i = 0; i < arr.length - k; i++) {
      arr[j] = arr[i];
      System.out.print(arr[j] + " ");
    }
    j++;
  }
}
