import java.util.*;
import java.io.*;

class details 
{
    int accno,bal=0,amount;
    String name,account_type;
    Scanner sc=new Scanner(System.in);

    void get_details()
    {
        System.out.println("\nEnter the Name:");
        name=sc.next();
        System.out.println("Enter the Account Number:");
        accno=sc.nextInt();
    }
   
    void deposit()
    {
        System.out.println("Enter the amount to deposit:");
        amount=sc.nextInt();
        bal=bal+amount;
        System.out.println("\nAmount deposited");
    }
    void withdraw()
    {
        System.out.println("Enter the amount to withdraw:");
        amount=sc.nextInt();
        if(amount>bal)
        {
            System.out.println("\nInsufficient Balance");
        }  
        else
        {
            bal=bal-amount;
            System.out.println("\nSuccessfully withdrawn");
        }
    }
    void display_details()
    {
        System.out.println("\nName :"+name+"\nAccount Number:"+accno+"\nBalance:"+bal);
    }
}

class bank
{
    public static void main(String args[])
    {
        int num,i;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of customer");
        num=sc.nextInt();

        details d[]=new details[num];

        for(i=0;i<=num;i++)
        {
            d[i]=new details();
            d[i].get_details();
            d[i].deposit();
            d[i].withdraw();
        }
        for(i=0;i<=num;i++)
        {
            d[i].display_details();
        }
    }
}