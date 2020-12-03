import java.util.*;
class Main{
    void Take_Input(){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the rows:"); 
       int rows=sc.nextInt();
       System.out.println("enter the columns:"); 
       int columns=sc.nextInt();
       
       System.out.println("Enter array elements : ");    
        
       int a[][]=new int[rows][columns];
        
          
        for(int i=0; i<a.length;i++)
         {            
            for(int j=0; j<a[0].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
         }
         Count_Odd_Even(a);

    }
    void Count_Odd_Even(int a[][]){
        int e=0;
         int o=0;
         for(int i = 0; i <a.length; i++){    
            for(int j = 0; j <a[0].length; j++){    
              if(a[i][j] % 2 == 0)  
              {
                e++; 
                System.out.println(" even numbers: " + a[i][j]); 
              }

              else   
              { 
                o++; 
                System.out.println(" odd numbers: " + a[i][j]); 
              }   
            }    
        }    
            
        System.out.println("Frequency of odd numbers: " + o);    
        System.out.println("Frequency of even numbers: " + e);    
    }        
    

}
class Array_2d_Odd_Even{
    public static void main(String[]args){
        Main a=new Main();
        a.Take_Input();
    }
}