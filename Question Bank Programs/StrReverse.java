public class StrReverse
{
    public static void main(String args[])    
    {

        String str = "Kishan", revStr="";

        // char ch[] = new char[str.length()];


        for(int i=0; i<str.length();i++)
        {
            // ch[i] = str.charAt(i); 
            revStr = str.charAt(i)+revStr;

        }

        System.out.println(revStr);


    }
}