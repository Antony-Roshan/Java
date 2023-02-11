import java.io.*;
import java.util.*;

abstract class println
{
    abstract void r();
}
interface prof
{
    void readp();
}

interface edu
{
    void reade();
}

class stud implements prof,edu
{
        int salary,sal;
        String name;
        Scanner sc=new Scanner(System.in);

        public void r()
        {
            System.out.println("Enter the salary1:");
            sal=sc.nextInt();
            System.out.println("Salary1:"+sal);
        }
        
        public void readp()
        {
            System.out.println("Enter the salary:");
            salary=sc.nextInt();
            System.out.println("Salary:"+salary);
        }

        public void reade()
        {
            System.out.println("Enter the Name:");
            name=sc.next();
            System.out.println("Name:"+name);
        }
    
}

class stu
{
    public static void main(String args[])
    {
        stud obj=new stud();
        obj.r();
        obj.readp();
        obj.reade();
    }
}