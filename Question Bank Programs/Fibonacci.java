public class Fibonacci
{
    public static void main(String args[])
    {

        int a=0, b=1,c=0;
        int n=10;


        while(c<=n)
        {
            System.err.print(c+" ");
            a=b;
            b=c;
            c=a+b;
        }

    }    

}
