import java.util.*;

class bankInternal {
int ac;
float bal, amt;
Scanner get = new Scanner(System.in);
void getdetails()
{
System.out.print(“Enter Account Number:”);
ac = get.nextInt();
System.out.println();
System.out.print(“Enter Initial Balance:”);
bal = get.nextFloat();
}
void deposit()
{
System.out.println();
System.out.print(“Enter Amount:”);
amt = get.nextInt();
bal = bal+amt;
System.out.println(“Success! Amount deposited. Balance Available:”+bal);
}

void withdraw()
{
System.out.println();
System.out.print(“Enter Amount:”);
amt = get.nextInt();
if(amt>bal)
{
System.out.println(“Insufficient Funds!!”);
}
else
{
bal = bal-amt;
System.out.println(“Amount Withdrawn! Available Balance:”+bal);
}
}

void balchk()
{
System.out.println(“Balance available in Account Number “+ac+” is: “+bal);
}
}

class bankArray {
public static void main(String args[])
{
boolean a=true;
int acno, flag;
Scanner in = new Scanner(System.in);
bankInternal obj[] = new bankInternal[100];
for(int i=0;i<3;i++) { 
    obj[i] = new bankInternal(); 
    }
     int ch; 
     do 
     {
         flag=1; //Reset flag value. 
         
         System.out.println("1.Add Account"+"\n"+"2.Deposit"+"\n"+"3.Withdraw"+"\n"+"4.Check Balance"+"\n"+"5.Exit"); 
         System.out.println(); 
         System.out.print("Enter your Choice:"); 
         ch = in.nextInt();
          switch(ch) 
          {
             case 1:for(int i=0;i<3;i++) 
             {
                 obj[i].getdetails(); 
             } 
             break; 
             
             case 2: System.out.println("Enter Account Number:");
              acno = in.nextInt();
               for(int i=0;i<3;i++) 
               {
                 if(acno == obj[i].ac)
                  {
                     obj[i].deposit();
                      flag=0; 
                      }
                       
                       }
                        if(flag==1)
                         {
                             System.out.println("Account number not found!!"+"\n"); 
                             }
                              break;
            
            case 3: System.out.println("Enter Account Number:");
             acno = in.nextInt();
              for(int i=0;i<3;i++)
               {
                 if(acno == obj[i].ac) 
                 {
                     obj[i].withdraw();
                      flag=0; 
                      }
                       }
                        if(flag==1)
                         {
                             System.out.println("Account number not found!!"+"\n");
                              }
                               break;
         case 4: System.out.println("Enter Account Number:"); 
         acno = in.nextInt();
          for(int i=0;i<3;i++) 
         {
             if(acno == obj[i].ac) 
             {
                 obj[i].balchk();
                  flag=0; 
                  } }
                   if(flag==1) 
                   {
                     System.out.println("Account number not found!!"+"\n");
                   }
                    break; 
         
         case 5: System.exit(0);
          default: System.out.println("Enter a valid Option!"+"\n\n");
           } }
           while(a);
            }
   }