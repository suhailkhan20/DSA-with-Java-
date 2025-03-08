package LINEAR;
public class searchstring {

    public static boolean printsearch(String str, char target){

        if(str.length()==0)
        {
            return false;
        }
        for(int i=0; i<str.length(); i++)
        {
            if(target==str.charAt(i))
            {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String [] args){
        String str = "Suhail khan";
        char target = 'n';

        boolean ans = printsearch(str,target);
        System.out.println(ans);
    }
}
