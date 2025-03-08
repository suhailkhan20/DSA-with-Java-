
public class MaxEle {
  public static int peakIndexInMountainArray(int[] arr) {
    int n = arr.length - 1;
    int max = arr[0];
    for (int i = 1; i <= n; i++) {
      if (arr[i] > max) {
        int temp = max;
        max = arr[i];
        arr[i] = temp;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    int arr[] = {858585, 2, 3, 4, 5, 6, 7, 9, 12, 102, 99, 35, 6, 5, 3, 1, 555, 8585 };
    System.out.println();
    int ans = peakIndexInMountainArray(arr);
    System.out.println();
    System.out.println("Max Element is: " + ans);
  }
}