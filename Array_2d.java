import java.util.*;
class Main{
    int a[][];
    void Take_Input(){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the rows:"); 
       int rows=sc.nextInt();
       System.out.println("enter the columns:"); 
       int columns=sc.nextInt();
       
       System.out.println("Enter array elements : ");    
        
       a=new int[rows][columns];
        
          
        for(int i=0; i<a.length;i++)
         {            
            for(int j=0; j<a[0].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
         }

    }
    void Search_Occurence(){
      int c=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the element to be search:");
      int x=sc.nextInt();
         for(int i = 0; i <a.length; i++){    
            for(int j = 0; j <a[0].length; j++){    
                if(a[i][j]==x)
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
class Array_2d{
    public static void main(String[]args){
        Main a=new Main();
        a.Take_Input();
        a.Search_Occurence();

    }
}