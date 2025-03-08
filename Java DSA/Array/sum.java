package Array;

import java.util.*;

public class sum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the Elements of array:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    Display(arr, n);

  }

  public static void Display(int[] arr, int n) {
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum = sum + arr[i];
    }
    System.out.print("total sum of the array element: " + sum);

  }

}
