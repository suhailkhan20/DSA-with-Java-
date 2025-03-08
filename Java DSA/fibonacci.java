import java.util.*;

public class fibonacci {

    public static void isfabonacci(int a, int b,int n)
    {
     if(n==0)
     {
        return;
     }
     int c = a+b;

     System.out.println(c);
     isfabonacci(b,c,n-1);

    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        isfabonacci(a,b,n-2);
    }
}
