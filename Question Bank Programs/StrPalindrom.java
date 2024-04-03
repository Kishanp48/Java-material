public class StrPalindrom
{
    public static void main(String args[])    
    {
        String str = "kvk";

        StringBuffer sb = new StringBuffer(str);

        sb.reverse();


        if(str.equals(sb.toString()))
        {
            System.out.println("is palindrom");
        }
        else
        {
            System.out.println("not palindrom");
        }

    }
}
