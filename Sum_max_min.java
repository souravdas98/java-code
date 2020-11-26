import java.util.*;
import java.lang.*;
class Main{

    void array(){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the length of the array:");
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<a.length;i++){
           System.out.println("enter the "+(i+1)+" element:");
           a[i]=sc.nextInt();
          

       }
       System.out.println("---------------------------------------------------");
       Sum(a);
       Max(a);
       Min(a);


    }
    void Sum(int []a)
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];

        }
        System.out.println("Sum is : "+sum);


    }

    void Max(int []a){
        int l=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>l)
            l=a[i];
        }
        System.out.println("largest element of the array: "+l);

    }
    void Min(int []a){
        int s=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<s)
            s=a[i];
        }
        System.out.println("Smallest element of the array: "+s);

    }
}
 class Sum_max_min{
    public static void main(String [] args){
        Main a=new Main();
        a.array();
    }

}