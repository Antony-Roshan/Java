import sum.s;
import java.util.*;

public class sums
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st:");
        a=sc.nextInt();
        System.out.println("Enter 2nd:");
        b=sc.nextInt();
        s ob=new s();
        c=ob.read(a,b);
        System.out.println("Sum is"+c);
    }
}