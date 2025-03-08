package LINEAR;
//  Selection sort  //

import java.util.*;

class selectionsort {

    public static void printArray(int arr[]) {
        System.out.println("Sorted Array is : ");
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

        System.out.println("Enter the Unsorted Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < arr.length - 1; j++) {
            int min = j;
            for (int k = j + 1; k < arr.length; k++) {
                if (arr[min] > arr[k]) {
                    min = k;
                }
            }
            int temp = arr[j];
            arr[j] = arr[min];
            arr[min] = temp;
        }
        printArray(arr);
    }
}