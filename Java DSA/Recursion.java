public class Recursion{

    public static void printnumber(int n)
    {
        if(n>10)
        {
            return ;
        }

        System.out.print(n+" ");

        printnumber(n+1);
    }
    public static void main(String [] args)
    {
        int n=1;

        printnumber(n);
    }
}