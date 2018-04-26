import java.util.Scanner;

public class HelloWorld{

     public static void main(String []args){
        
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
      
        System.out.print(isPrime(input));
     }
     
     public static boolean isPrime(int input){
         
         if(input == 2 || input == 3){
             return true;
         }
         if(input % 2 == 0){
             return false;
         }
	
         int sqrt = (int) Math.sqrt(input) + 1;
         for (int i = 3; i < sqrt; i+=2){
             if( input % i == 0){
                 return false;
             }
         }         
         return true;
     }
     
}
