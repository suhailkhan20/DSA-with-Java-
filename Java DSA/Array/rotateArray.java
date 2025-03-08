package Array;

import java.util.*;

public class rotateArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array : ");
        int size = sc.nextInt();

        System.out.println("Enter the elements of the Array :");
        int arr[] = new int[size];

        for (int k = 0; k < size; k++) {
            arr[k] = sc.nextInt();
        }

        System.out.println("Element's are stored in the Array with 'Index' :");

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " At index " + i);
        }

        System.out.println("Rotated Array is with 'Index': ");

        int n = size - 1;
        for (int j = 0; j < size; j++) {
            int start = arr[j];
            int end = arr[n];

            int temp = start;
            start = end;
            end = temp;
            System.out.println(start + " At index " + j);
            n = n - 1;
        }
    }
}
