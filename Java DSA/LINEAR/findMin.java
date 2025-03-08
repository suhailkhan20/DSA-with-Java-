package LINEAR;

public class findMin {

    
    // return the Minimum Element //

    public static int searchMin(int arr[])
    {
        int min=0;
        for(int i=1; i<arr.length; i++){
            if(arr[min]>arr[i]){
                int temp=arr[min];
                    arr[min]=arr[i];
                    arr[i]=temp;
            }
        }
        return arr[min];
    }

    public static void main(String[] args) {
        int arr[] = {14,2,-15,8,4,-50,7,1,-9};
       
        int ans=searchMin(arr);
        System.out.println("Minimum Element is :" +ans);
    }
}
