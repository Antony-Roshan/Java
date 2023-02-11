import java.io.*;
import java.util.*;
class cake
{
int rate;
String flr;
void read()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the rate:");
rate=sc.nextInt();
System.out.println("enter the flavor:");
flr=sc.next();
}
}
class ordercake extends cake 
{
int weight,price;
void pricecalc()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the weight:");
weight=sc.nextInt();
price=weight*rate;
System.out.println(price);
}
}
class readymadecake extends cake
{
void pricecalc()
{
int qty,price;
Scanner sc=new Scanner(System.in);
System.out.println("enter the quantity:");
qty=sc.nextInt();
price=qty*rate;
System.out.println(price);
}
}
class food
{
public static void main(String args[])
{
ordercake ock=new ordercake();
ock.read();
ock.pricecalc();
readymadecake rck=new readymadecake();
rck.read();
rck.pricecalc();
}
}

