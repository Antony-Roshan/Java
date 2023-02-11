import java.util.*;
import java.io.*;

class mat
{
    public static void main(String args[])
    {
        int i,j=0,k=0,sum=0,r1,c1,r2,c2;
        Scanner sc=new Scanner(System.in);

        //Size of the first matrix
        System.out.println("Enter the row and coloum of first matrix:");
        r1=sc.nextInt();
        c1=sc.nextInt();

        //Size of the second matric
        System.out.println("Enter the row and coloum of second matrix:");
        r2=sc.nextInt();
        c2=sc.nextInt();
        
        int a[][]=new int[r1][c1];
        int b[][]=new int[r2][c2];
        int x[][]=new int[r1][c1];

        //First matrix
        System.out.println("\nEnter the elements of first matrix:");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nElements of first matrix:");

        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                System.out.print(a[i][j]);
                System.out.print("  ");  
            }
            System.out.println("\n");
        }

        //Second matrix
        System.out.println("Enter the elements of second matrix:");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nElements of second matrix:");

        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                System.out.print(b[i][j]);
                System.out.print("  ");
            }
            System.out.println("\n");
        }

    }
}