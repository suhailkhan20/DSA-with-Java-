package BINARY;

import java.util.*;

public class binary {

    public static void printBinary(int n, int m) {
        if (n == 0) {
            return;
        }
        int r = n % m;
        n = n / m;
        printBinary(n, m);
        System.out.print(r + " ");

        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Decimal number: ");
        int n = sc.nextInt();
        System.out
                .println("If you want to convert the " + n + " into 'Binary' , So press 2.\nIf you want to convert the "
                        + n + " into 'Octal' , So press 8.\nIf you want to convert the " + n
                        + " into 'HexaDecimal' , So press 16.");
        int m = sc.nextInt();

        System.out.println("Your Output is : ");

        printBinary(n, m);
    }
}
