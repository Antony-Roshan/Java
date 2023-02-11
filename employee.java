import java.util.*;
import java.io.*;

class emp
{
    int emp_id,total,basic,hra,bonus;
    String desg,name;

    Scanner sc=new Scanner(System.in);

    void details()
    {
        System.out.println("\nEnter the name:");
        name=sc.next();
        System.out.println("\nEnter the Designation:");
        desg=sc.next();
        System.out.println("\nEnter the Basic Salary:");
        basic=sc.nextInt();
        System.out.println("\nEnter HRA:");
        hra=sc.nextInt();
        System.out.println("\nEnter the Bonus Salary:");
        bonus=sc.nextInt();
    }

    void salary()
    {
        total=basic+hra+bonus;
    }

    void display()
    {
        System.out.print(name+"\t\t"+desg+"\t\t"+basic+"\t\t"+hra+"\t\t"+bonus+"\t\t"+total+"\n");
    }
}

class employee
{
    public static void main(String args[])
    {
        int n,i;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of employees:");
        n=sc.nextInt();

        emp e[]=new emp[n];

        for(i=0;i<n;i++)
        {
            e[i]=new emp();
            e[i].details();
            e[i].salary();
        }
        System.out.println("\n****EMPLOYEE DETAILS***\n\n");
        System.out.print("Name\t\tDesignation\t\tBasic\t\tHRA\t\tBonus\t\tTotal Salary\n");
        for(i=0;i<n;i++)
        {
            e[i].display();
        }

    }
}