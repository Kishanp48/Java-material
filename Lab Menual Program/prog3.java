class prog3
{
    public static void main(String args[])
    {
        int no=2;
        if(no%2==0)
        {
            System.out.println(no+" is even");
        }
        else
        {
            System.out.println(no+" is odd");
        }


        ////

        int i = 1;
        while(i<=10)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
            i++;
        }

        //

        int n=5, fact=1;
        for(int j=1;j<=n;j++)
        {
            fact*=j;
        }
        System.out.println("Factorial of "+n+" is: "+fact);

    }
}