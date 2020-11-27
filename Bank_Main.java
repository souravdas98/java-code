import java.util.*;

import javax.lang.model.util.ElementScanner6;

import java.lang.*;
class Main{
    int account_number[]=new int[100];
    String account_name[]=new String[100];
    double account_balance[]=new double[100];
    String account_type[]=new String[100];
    int count=0;

    int cou(){
        count++;
        return count;
    }


    void Create_account(){
        System.out.println("----------------------CREATE A ACCOUNT-------------------------");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  An Account Number:");
        int a_c=sc.nextInt();
        account_number[count]=a_c;
        System.out.println("Enter Account Holder Name:");
        String a_n=sc.next();
        account_name[count]=a_n;
        System.out.println("Enter Account Balance:");
        double a_b=sc.nextDouble();
        account_balance[count]=a_b;
        String s="Saving";
        String c="Current";

        System.out.println("Enter 1 For Saving");
        System.out.println("Enter 2 For Current");
            System.out.println("Enter Your Choice:");
            int ch=sc.nextInt();
            if(ch==1)
            account_type[count]=s;
            else
            account_type[count]=c;
            cou();

        

    }
    void Deposit(){
        System.out.println("----------------------Deposit Menu---------------------");
        int l=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account Number:");
        int n=sc.nextInt();
        for(int i=0;i<account_number.length;i++)
        {
            if(account_number[i]==n)
            l=i;
        }
        System.out.println("Enter The Amount To Insert In Your Account:");
        double amount=sc.nextDouble();
        account_balance[l]=account_balance[l]+amount;
        System.out.println("Succeefully Insert");
        
    }
    void Withdraw(){
        System.out.println("----------------------Withdraw Menu-----------------------");
        int l=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account Number:");
        int n=sc.nextInt();
        for(int i=0;i<account_number.length;i++)
        {
            if(account_number[i]==n)
            l=i;
        }
        System.out.println("Enter The Amount Withdraw From  Your Account:");
        double amount=sc.nextDouble();
        if(amount<account_balance[l]){
            account_balance[l]=account_balance[l]-amount;
            System.out.println("Succeefully Withdraw");
        }
        else{
            System.out.println("Insaficient Balance");
        }




        
    }
    void Display_Details(){
        System.out.println("----------------------Display account Details-----------------------");
        System.out.println("Enter The Account Number:");
        Scanner sd=new Scanner(System.in);
        int m=sd.nextInt();
        int l=0;
        for(int i=0;i<account_number.length;i++){
            if(account_number[i]==m){
                l=i;
            }

        }
        System.out.println("Account Number Is - "+account_number[l]);
        System.out.println("Account Holder Name Is - "+account_name[l]);
        System.out.println("Account Type Is - "+account_type[l]);
        System.out.println("Account Balance Is - "+account_balance[l]);

        


    }
    void Exit(){
        System.out.println("----------------------Thanks-For using  The System------------------");
        System.out.println("----------------------Have a good Day-------------------------------");
        System.exit(0);
    }
}
class Bank_Main{
    public static void main(String[]args){
        Main a=new Main();
        
        while(true){
            System.out.println("-----------------------------MENU-------------------------------");
            System.out.println("1.For Create An Account");
            System.out.println("2.For Deposit Money In Your Account:");
            System.out.println("3.For Withdraw Money From Your Account");

            System.out.println("4.For Display Account Details");
            System.out.println("5.For Exit From The System");
            System.out.println("---------------------------SELECT OPTION---------------------------");
            Scanner e=new Scanner(System.in);
            System.out.println("Enter Your Choice");
            int choice=e.nextInt();
            switch(choice){
                case 1:
                     a.Create_account();
                     break;
                case 2:
                     a.Deposit();
                     break;
                case 3:
                     a.Withdraw();
                     break;
                case 4:
                     a.Display_Details();
                     break;
                case 5:
                     a.Exit();
                     break;
            }
        }

    }
}