public class PalindromNo
{
    public static void main(String args[])
    {
        int no = 121, tempNo = no, rem, reverse=0;

        while(no!=0)
        {
            rem = no%10;
            reverse = reverse *10 +rem;
            no /=10;
        }

        if(reverse == tempNo)
        {
            System.out.println(tempNo+" is Palindrom no.");
        }
        else
        {
            System.out.println(tempNo+" is not Palindrom no.");
        }
        

    }    
}
