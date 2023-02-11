import java.io.*;

class thread1 extends Thread
{
    public void run()
    {
        int i,p;
        for(i=1;i<=10;i++)
        {
            p=4*i;
            System.out.println(1+"* 4 ="+p);
        }
    }
}
class thread2 extends Thread
{
    public void run()
    {
        int i,p;
        for(i=1;i<=10;i++)
        {
            p=4+i;
            System.out.println(1+"+ 4 ="+p);
        }
    }
}

class threadmain
{
    public static void main(String args[])
    {
        try
        {
            thread1 th1=new thread1();
            thread2 th2=new thread2();
            Thread t1=new Thread(th1);
            Thread t2=new Thread(th2);
            t1.start();
            t1.sleep(2000);
            t2.start();
        }
        catch(Exception e)
        {

        }
    }
}