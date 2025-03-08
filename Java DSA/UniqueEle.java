import java.util.*;

class uniqueEle {

  static int unique(int arr[], int target) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[i] == arr[j]) {
          arr[i] = -1;
          arr[j] = -1;
        }
      }
    }
    int ans = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] > 0) {
        ans = arr[i];
      }
    }
    return ans;
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

    int target = 5;
    int ans = unique(arr, target);
    System.out.println("Unique Element is : " + ans);
  }
}
