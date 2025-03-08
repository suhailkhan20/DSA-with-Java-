import java.util.*;

public class hanoi{

    public static void TowerofHanoi(int n, String src, String helper, String dest)
    {
        if(n==1)
        {
            System.out.println("transfer of disk "+n+" from " +src +" to "+dest);
            return;
        }

        TowerofHanoi(n-1,src,dest,helper);
        System.out.println("transfer of disk "+n+" from " +src +" to "+dest);
        TowerofHanoi(n-1,helper,src,dest);

    }

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of disk: ");
        int n=sc.nextInt();

        TowerofHanoi(n,"S","H","D");
    }
}