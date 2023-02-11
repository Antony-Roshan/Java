import java.io.*;
class Thread1 extends Thread
{
public void run()
{
int i,p;
for(i=0;i<10;i++)
{
p=4*i;
System.out.println(i+"* 4 = "+p);
}
}
}
class Thread2 extends Thread
{
public void run()
{
int i,p;
for(i=0;i<10;i++)
{
p=4+i;
System.out.println(i+"+ 4 = "+p);
}
}
}
class Threadmain
{
public static void main(String args[])
{
    try
{
Thread1 th1=new Thread1();
Thread2 th2=new Thread2();
Thread t1=new Thread(th1);
Thread t2=new Thread(th2);
t1.start();
t1.sleep(1000);
t2.start();
}
catch(Exception e)
{
}
}
}