import java.io.*;
import java.util.*;

class cake 
{
    String flavor;
    int rate;
    void read(String f,int r)
    {
        rate=r;
        flavor=f;
    }
    void display()
    {
        System.out.println("The Flavour is:"+flavor);
        System.out.println("The Rate is:"+rate);   
    }
}

class ordercake extends cake 
{
    int weight,price;
    void read1(int w)
    {
        weight=w;
    }
    void pricecalc()
    {
        price=weight*rate;
        System.out.println("The weight is:"+weight);        
        System.out.println("The price is:"+price);
    }
}

public class test2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String fl;
        int ra,we=0;
        System.out.println("Enter the Flavour:");
        fl=sc.next();
        System.out.println("Enter the Rate:");
        ra=sc.nextInt();
        System.out.println("Enter the weight:");
        we=sc.nextInt();
        /*cake c=new cake();
        c.read(fl,ra);
        c.display();*/
        ordercake oc=new ordercake();
        oc.read(fl,ra);
        oc.display();
        oc.read1(we); 
        oc.pricecalc();
    }        
}
