                       // Sum of all natural numbers //

public class naturalno {

    public static void printnatural(int i, int n, int sum)
    {
        if(i==n)
        {
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        printnatural( i+1, n, sum);
    }
    public static void main(String [] args)
    {
      
        printnatural(1,5,0);
    }
}
