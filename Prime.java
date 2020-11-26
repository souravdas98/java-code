import java.util.*;
public class Prime {
    public static void main(String[]args){
        for(int j=5;j>0;j--)
        {

        Scanner scan=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=scan.nextInt();
        int count=0;
        int i=2;

        while(i<n)
        {
            if(n%i==0){
                count=1;
                break;
            }
            else
            {
               count=0;
            }
            i++;
            
        }
        if(n==1)
        System.out.println("1 is neither prime nor composite.");
        else if(count==1)
        System.out.println("not prime");
        else
        System.out.println("prime");
    }


    }
    
}
