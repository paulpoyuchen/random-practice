import java.lang.*;
import java.io.*;
import java.util.*;
 

public class HelloWorld{

     public static void main(String []args){
        
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        
        System.out.println(reverse(input));
      
     }
     public static String reverse(String input){
         String result = "";
         int i = 0;
         while(i<input.length()){
             result =  input.charAt(i)+ result;
             i++;
         }
         return result;
     }
}
