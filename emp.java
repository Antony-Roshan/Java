import java.io.*;
import java.util.*;

interface prof
{
    void read();
}

interface loan
{
    void read1();
}

class employee implements prof,loan
{
    String desg,loan_date;
    int salary,amount;

    Scanner sc=new Scanner(System.in);
    public void read()
    {
        System.out.println("Enter the Designation and salary:\n");
        desg=sc.next();
        salary=sc.nextInt();
        System.out.println("\nDesignation:"+desg+"\nsalary"+salary);
    }

    public void read1()
    {
        System.out.println("\nEnter the Loan Date and Amount:\n");
        loan_date=sc.next();
        amount=sc.nextInt();
        System.out.println("\nLoan Date:"+loan_date+"\nAmount"+amount);        
    }
}

class emp
{
    public static void main(String args[])
    {
        employee e=new employee();
        e.read();
        e.read1();
    }
}