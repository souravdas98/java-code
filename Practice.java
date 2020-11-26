import java.util.*;
import java.lang.*;
class Practice{
    public static void main(String[]args){

        //Sum of all array elements
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        System.out.println("enter the array element:");
        for(int i=0;i<a.length;i++)
        {
        
        a[i]=sc.nextInt();
        sum=sum+a[i];

        }
        System.out.println("sum is  "+sum);

        //largest and the smallest number/value in the array

        int l=a[0];
        int s=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>l)
            l=a[i];
            if(a[i]<s)
            s=a[i];
        }
        System.out.println("the largest element of the array is : "+l);
        System.out.println("the smallest element of the array is : "+s);



}

    
    

    
}