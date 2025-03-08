package LINEAR;

import java.util.*;

public class insertionsort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        // Input the Array //

        System.out.println("Enter the Unsorted Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting //

        for (int j = 1; j < arr.length; j++) {
            int current = arr[j];
            int k = j - 1;
            while (k >= 0 && current < arr[k]) {
                arr[k + 1] = arr[k];
                k--;
            }
            arr[k + 1] = current;
        }
        printArray(arr);
    }

}
