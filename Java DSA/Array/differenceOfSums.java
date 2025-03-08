package Array;

public class differenceOfSums {

  static int diffOfsums(int n, int m) {
    int sum1 = 0;
    int sum2 = 0;

    for (int i = 1; i <= n; i++) {
      if (i % m == 0) {
        sum1 = sum1 + i;
      } else if (i % m != 0) {
        sum2 = sum2 + i;
      }
    }
    int diff = sum2 - sum1;
    return diff;
  }

  public static void main(String[] args) {
    int n, m;
    int ans = diffOfsums(5, 1);
    System.out.println(ans);
  }
}
