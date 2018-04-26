import java.lang.*;
import java.io.*;
import java.util.*;

public class HelloWorld{

     public static void main(String []args){     
        Scanner scan = new Scanner(System.in);
        String input = scan.next();   
        System.out.println(isPal1(input));
        System.out.println(isPal2(input));
        System.out.println(isPal3(input));
     }
     
     public static boolean isPal1( String input){
         StringBuilder s2 = new StringBuilder();
         s2.append(input);
         s2 = s2.reverse();
        return (input.equals(s2.toString()));
     }

     public static boolean isPal2( String input){
         StringBuilder s2 = new StringBuilder();
         int cur;
        for(int i = 0; i < input.length(); i ++ ){
            cur = input.length() - i;
            s2.append(input.substring(cur- 1, cur));
        }
        return (input.equals(s2.toString()));
     }
     
     public static boolean isPal3( String input){
         int s1 = 0; 
         int s2 = input.length()-1;
         while(s2> s1){
             String w1 = input.substring(s1,s1+1);
             String w2 = input.substring(s2-1,s2);
             if(w1.equals(w2)!=true){
                 return false;
             }
             s1++;
             s2--;
         }
         return true;
}
