import java.lang.*;
import java.io.*;
import java.util.*;
 

public class HelloWorld{

     public static void main(String []args){
        
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        
        System.out.println(Factorial(input));
      
        
    
     }
    public static int Factorial(int input){
        if(input == 1){
            return 1;
        }
        else{
            return input*Factorial(input-1);
        }
    }
}



