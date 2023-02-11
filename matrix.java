import java.util.*;
import java.io.*;

class design
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
        /*System.out.println("Enter the row and coloum of second matrix:");
        r2=sc.nextInt();
        c2=sc.nextInt();*/
        
        int a[][]=new int[r1][c1];
        //int b[][]=new int[r2][c2];
        //int x[][]=new int[r1][c1];

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
        /*System.out.println("Enter the elements of second matrix:");
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
        }*/

        //Addition of matrix
      /* for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                x[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Matrix after addition");

        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                System.out.print(x[i][j]);
                System.out.print("  ");
            }
             System.out.println("\n");
        }  */

        //Substraction of matrix
        /*for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                x[i][j]=a[i][j]-b[i][j];
            }
        }
        System.out.println("Matrix after substraction");

        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                System.out.print(x[i][j]);
                System.out.print("  ");
            }
             System.out.println("\n");
        }   */

    /*if(r2!=c1)
    {
        System.out.println("Multiplication not possible");
    }   
    else
    {
        for(i=0;i<r1;i++)
        { 
            for(j=0;j<c2;j++)
            {
                for(k=0;k<c1;k++)
                {
                 x[i][j]+=a[i][k]*b[k][j];
                }       
            }
        }

        System.out.println("Matrix after Multiplication");

        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                System.out.print(x[i][j]);
                System.out.print("  ");
            }
             System.out.println("\n");
        }  
    }*/

    //Upper diagonal triangle
   /* for(i=0;i<r1;i++)
    {
        for(k=i;k<c1;k++)
        {
            System.out.println(a[i][j]);  //print the upper triangle elements    
            sum=sum+a[i][k];
        }
    }
    System.out.println("Sum of upper triangle:"+sum);*/

    //Lower diagonal triangle
   /* for(i=0;i<r1;i++)
    {
        for(j=0;j<c1;j++)
        {
            if(i>=j)
            {
                System.out.println(a[i][j]);  //print the lower triangle elements
                sum=sum+a[i][j];
            } 
        }
    }
    System.out.println("Sum of upper triangle:"+sum);*/

    //Right diagonal elements
   /* for(i=0;i<r1;i++)
    {
        for(j=0;j<c1;j++)
        {
            if(i==j)
            {
                System.out.println(a[i][j]);
                sum=sum+a[i][j];
            } 
        }
    }
    System.out.println("Sum of upper triangle:"+sum);*/
    
    //Left diagonal elements
   /* for(i=0;i<r1;i++)
    {
        for(j=0;j<c1;j++)
        {
            if(i+j==r1-1)
            {
                System.out.println(a[i][j]);
                sum=sum+a[i][j];
            } 
        }
    }
    System.out.println("Sum of upper triangle:"+sum);  */

    //sum of each coloum 
   /* for(i=0;i<r1;i++)
    {
        sum=0;
        for(j=0;j<c1;j++)
        {
          sum=sum+a[i][j];  
        }
        System.out.println("Sum of coloum "+(i+1)+" is:"+sum);
    } */
     
      //sum of each row
      for(i=0;i<c1;i++)
      {
        sum=0;
        for(j=0;j<r1;j++)
        {
            sum+=a[j][i];
        }
        System.out.println("Sum of row "+(i+1)+" is:"+sum);        
      }  

      
    }
}