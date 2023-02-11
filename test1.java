import calculator.sum;
import java.util.*;

class test1
{
    public static void main (String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        a=sc.nextInt();
        System.out.println("Enter the value of b");
        b=sc.nextInt();
        sum s=new sum();
        c=s.calculate(a,b);
        System.out.println("Sum is"+c);
    }
}