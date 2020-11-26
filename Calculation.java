import java.util.*;
class Cal{
      int a,b,sum,subs,mul,div;
      Scanner sc=new Scanner(System.in);
      void put_data(){
           System.out.print("Enter your first number: ");
           a=sc.nextInt();
           System.out.print("Enter your second number: ");
           b=sc.nextInt();
           sum=a+b;
           if(a>b){
                 subs=a-b;
           }
           else{
                 subs=b-a;

           }
           mul=a*b;
           if(a>b){
            div=a/b;
           }
           else{
            div=b/a;

      }

           
      }
      void get_data(){
           System.out.println("The sum of is= "+sum);
           System.out.println("The substraction  is= "+subs);
           System.out.println("The multiplication  is= "+mul);
           System.out.println("The division  is= "+div);
      }
}
class Calculation{
      public static void main(String[] args){
            Cal b=new Cal();
            b.put_data();
            b.get_data();
      }
}