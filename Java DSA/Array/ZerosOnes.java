package Array;

import java.util.Scanner;

public class ZerosOnes {

  static void twopointer(int arr[]) {
    int s = 0;
    int n = arr.length;
    int e = n - 1;
    while (s < e) {
      if (arr[s] == 1 && arr[e] == 0) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        s++;
        e--;
      } else if (arr[s] == 0) {
        s++;
      } else if (arr[e] == 1) {
        e--;
      }
    }
    // System.out.print(arr[s] + " ");
    // System.out.print(arr[e] + " ");
  }

  static void Zeros(int arr[]) {
    int n = arr.length;
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == 0) {
        count++;
      }
    }
    for (int i = 0; i < n; i++) {
      if (i < count) {
        arr[i] = 0;
      } else {
        arr[i] = 1;
      }
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the Array : ");
    int size = sc.nextInt();
    System.out.println("Enter the elements of the Array :");
    int arr[] = new int[size];
    for (int k = 0; k < size; k++) {
      arr[k] = sc.nextInt();
    }

    System.out.println("sorted array is ");
    // Zeros(arr);
    twopointer(arr);
    System.out.println(arr);
  }
}
