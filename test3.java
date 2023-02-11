import java.io.*;
import java.util.*;

class cake 
{
    String flavor;
    int rate;

    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Flavour:");
        flavor=sc.next();
        System.out.println("Enter the Rate:");
        rate=sc.nextInt();
    }
}

class ordercake extends cake
{
    int weight,price;
    void read1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Weight:");
        weight=sc.nextInt();
    }
    void pricecalc()
    {
        price=weight*rate;
        System.out.println("Price="+price);
    }
}

class readymadecake extends cake
{
    int quantity,price;
    void read1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the quantity:");
        quantity=sc.nextInt();
    }
    void pricecalc()
    {
        price=quantity*rate;
        System.out.println("Price="+price);
    }
}

class test3
{
    public static void main(String args[])
    {
        ordercake ob=new ordercake();
        ob.read();
        ob.read1();
        ob.pricecalc();
        readymadecake obj=new readymadecake();
        obj.read();
        obj.read1();
        obj.pricecalc();
    }    
}