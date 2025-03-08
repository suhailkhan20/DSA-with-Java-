import java.util.*;

public class factorial {

    public static int printfactorial(int n)
    {
      if(n==0 || n==1)
      {
        return 1;
      }

      int fact_nm1 = printfactorial(n-1);
      int fact_n   = n*fact_nm1;

      return fact_n;


    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
       int ans = printfactorial(n);
       System.out.println(ans);
    }
}
