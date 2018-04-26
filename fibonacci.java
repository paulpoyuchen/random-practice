java fibonacci practices: 

import java.util.Scanner;

public class HelloWorld{

     public static void main(String []args){
        
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        for(int i = 0; i < input; i ++){
            System.out.print(fibonacci(i) +" ");
        }
     }



public static int fibonacci(int input){
         if(input == 0 || input ==1){
             return 1;
         }
         else{
             return fibonacci(input-1) + fibonacci(input-2);
         }
     } 
}

public static void fibonacci2(int n){
         int f1 = 0;
         int f2 = 1;
         int f3 = 0;
         System.out.println(f2);
         for(int i = 0; i < n; i++){
             f3 = f1+f2;
             f1 = f2;
             f2 = f3;
             System.out.println(f3+" ");
         }
     }