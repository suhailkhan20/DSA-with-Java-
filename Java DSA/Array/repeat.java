package Array;

import java.util.Scanner;

public class repeat {

  static int repeatval(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          return arr[i];
        }
      }
    }
    return -1;
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

    int ans = repeatval(arr);
    System.out.println("Your first repeated value is : " + ans);
  }
}
