class Factorial
{
    public static void main(String args[])
    {
        int fact=1, no=5;

        for(int i=1;i<=no;i++)
        {
            fact*=i;
        }
        System.out.println("Factorial of "+no+" is: "+fact);

    }
}

abstract class Hello
{

    abstract void m1();

}

