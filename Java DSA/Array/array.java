package Array;

import java.util.*;

public class array {

  public static int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[] { i, j };
        }
      }
    }
    return new int[] {};
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int target = sc.nextInt();

    int size = sc.nextInt();
    int nums[] = new int[size];

    for (int i = 0; i < size; i++) {
      nums[i] = sc.nextInt();
    }

    twoSum(nums, target);
  }
}
