public class revString {

    public static void reversestring(String str, int index)
    {

        
        if(index==0)
        {
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        reversestring(str, index-1);
    }
    public static void main(String [] args )
    {
        String str = "abcd";
        
        System.out.println("Input string is : "+str);
        
        System.out.println("reverse string is: ");

    reversestring(str,str.length()-1);
}
}
