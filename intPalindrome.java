import java.lang.*;
import java.io.*;
import java.util.*;
 

public class HelloWorld{

     public static void main(String []args){
        
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        
        System.out.println(intPal1(input));
        System.out.println(intPal2(input));
        
    
     }
     public static boolean intPal1(int input){
         String s1 = input + "";
         StringBuilder i1  = new StringBuilder(s1);
         return s1.equals(i1.reverse().toString());
     }

     public static boolean intPal2(int input){
         int pal = input;
         int reverse = 0;
         
         while(pal != 0) {
             int remainder = pal % 10;
             reverse = reverse * 10 + remainder;
             pal = pal/10;
             
         }
         
         return input == reverse;
     }
}
