class MyException extends Exception
{

    MyException(String str)
    {
        super(str);

    }

}

class Try
{
    

    public static void main(String[] args) {
        
        int i =10, j=0;
        try
        {
            if(j==0)
            {
                throw new MyException("hello it's Error!!");
            }
            else
            {
                System.out.println(i/j);
            }
        }
        catch(MyException e)
        {
            System.out.println(e.toString());
        }

    }

}











/* class A extends Thread
{
    public void run()
    {
        try{
       
            for(int i=1;i<=10;i++)
            {
                System.out.println("A: "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}

class B extends Thread
{
    public void run()
    {
        try{
       
            for(int i=1;i<=10;i++)
            {
                System.out.println("B: "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}

class Try
{
    public static void main(String[] args)
    {
        A a1 = new A();    
        B b1 = new B();    

        a1.start();

        System.out.println("Before a1: "+a1.isAlive());
        System.out.println("Before b1: "+b1.isAlive());
        
        try
        {
            a1.join();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        
        b1.start();
        
        System.out.println("After a1: "+a1.isAlive());
        System.out.println("After b1: "+b1.isAlive());
    }
} */