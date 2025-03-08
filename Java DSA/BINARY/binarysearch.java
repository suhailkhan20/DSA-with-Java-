package BINARY;

public class binarysearch {

    public static int searching(int arr[], int target) {
        int st = 0;
        int end = arr.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                st = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6, 8, 9, 12 };
        int target = 45;
        int ans = searching(arr, target);
        System.out.println(ans);
    }
}
