package LINEAR;

public class Searchin2D {

    // return the Element in 2D array //

    public static int[] searchElement(int[][] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; i<arr[i].length; j++){
            if(arr[i][j]==target){
                return new int []{i,j};
            }
            }
        }
        return new int []{-1,-1};
    }
public static void main(String [] args)
{
    int arr[][]={
        {4,5,48},
        {45,21,-12},
        {25,18,-45,22},
    };

    int target = -12;
    int[] ans = searchElement(arr, target);
    System.out.println(ans);
}
}
