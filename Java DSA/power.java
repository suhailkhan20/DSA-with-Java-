import java.util.Scanner;

public class power {

    public static int ispower(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        else if (x==0)
        {
            return 0;
        }

       int pow = ispower(x, n-1);
        int d=x*pow;
        return d;
    }
    public static void main(String [] args)
    {
         Scanner sc = new Scanner(System.in);
         int x=sc.nextInt();
         int n=sc.nextInt();

          int ans = ispower(x,n);

          System.out.println(ans);
    }
}
