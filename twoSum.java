import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        int [] a1 = {1,3,4,6,7};
        System.out.println(findPairs(a1, 12));
        
     }
     
     public static boolean findPairs(int[] a1, int input){
         HashMap<Integer, Integer> data = new HashMap<>();
         int offset;
         for(int i = 0; i < a1.length; i++){
             offset = input - a1[i];
             if(data.containsKey(offset)){
                 return true;
             }
             data.put(a1[i], i);
         }

         return false;
     }
}
