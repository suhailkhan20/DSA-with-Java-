package Array;

import java.util.Scanner;

public class secondMax {

  static int findmaxno(int arr[]) {
    int mx = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > mx) {
        mx = arr[i];
      }
    }
    return mx;
  }

  static int secondMaxno(int arr[]) {
    int mx = findmaxno(arr);
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == mx) {
        arr[i] = Integer.MIN_VALUE;
      }
    }
    int secondMax = findmaxno(arr);
    return secondMax;
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
    int ans = secondMaxno(arr);
    System.out.println("Second maximum number is : " + ans);
  }
}
