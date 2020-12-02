import java.util.*;

import javax.lang.model.util.ElementScanner6;

import java.lang.*;
class Main{
    void Take_Input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            System.out.println("enter the "+(i+1)+" elemrnt of the array:");
            a[i]=sc.nextInt();
        }
        System.out.println("array element are:");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("----------------------------------------------------");
        
        Count_Odd_Even(a);

    }
    void Count_Odd_Even(int a[]){
        int o=0;
        int e=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0)
            {
            System.out.println("even element are :"+a[i]);
            e++;
            }
            else{
                System.out.println("odd element are :"+a[i]);
                o++;
            }

            System.out.println("----------------------------------------------------");

        }
        System.out.println("odd number :"+o);
        System.out.println("even number :"+e);
        System.out.println("----------------------------------------------------");

    }
}
class Array_1d{
    public static void main(String[]args){
        Main a=new Main();
        a.Take_Input();
    }
}