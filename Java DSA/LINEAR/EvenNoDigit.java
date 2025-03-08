// LEET CODE 1295  // 

package LINEAR;
import java.util.Scanner;
public class EvenNoDigit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the Array: ");
    int size = sc.nextInt();

    int arr[] = new int[size];
    System.out.print("Enter the Elements of the Array: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    int even = 0;
    for (int i = 0; i < arr.length; i++) {
      int count = 0;
      while (arr[i] != 0) {
        count++;
        arr[i] = arr[i] / 10;
      }
      if (count % 2 == 0) {
        even++;
      } else {
        even = 0;
      }
    }
    System.out.print("In which " + even + " numbers are Even digits.");
  }
}
