import java.util.*;

import javax.lang.model.util.ElementScanner6;

import java.lang.*;
class Main{
    int a[];
    void Take_Input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the array:");
        int n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<a.length;i++){
            System.out.println("enter the "+(i+1)+" elemrnt of the array:");
            a[i]=sc.nextInt();
        }
        System.out.println("----------------------------------------------------");
        
        

    }
    void Search_Occurence(){
        int c=0;
        System.out.println("Enter the element to be serach:");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(x==a[i]){
                c++;
            }


        }
        if(c==0){
            System.out.println(x+" element is not found");
        }
        else{
        System.out.println(x+" element is present in an array the Occurrences of the number is "+c);
        }
       

    }
    
}
class Array_1d{
    public static void main(String[]args){
        Main a=new Main();
        a.Take_Input();
        a.Search_Occurence();
    }
}