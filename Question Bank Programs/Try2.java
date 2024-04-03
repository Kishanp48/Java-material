class Message
{
    public void show(String name)
    {
        synchronized(this)
        {
            for(int i=1;i<=3;i++)
            {
                try
                {
                    System.out.println("you are "+name);
                    Thread.sleep(1000);
                }
                catch(Exception e)
                {
                    
                }
            }
        }
    }
}

class MyThread extends Thread
{
    Message m;
    String name;

    MyThread(Message m, String name)
    {
        this.m = m;
        this.name = name;
    }
    public void run()
    {
        m.show(name);
    }
}

public class Try2   
{
    public static void main(String[] args)
    {
        
        Message obj = new Message();

        MyThread t1 = new MyThread(obj, "Kishan");
        MyThread t2 = new MyThread(obj, "Chotu");

        t1.start();
        t2.start();
        

    }
}
