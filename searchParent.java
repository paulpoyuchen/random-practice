import java.io.*;
import java.util.*;

/*
Suppose we have some input data describing a graph of relationships between parents and children over multiple generations. The data is formatted as a list of (parent, child) pairs, where each individual is assigned a unique integer identifier.

For example, in this diagram, 3 is a child of 1 and 2, and 5 is a child of 4:
1   2   4
 \ /   / \
  3   5   8
   \ / \   \
    6   7   9
Sample output (pseudocode):
[
  [1, 2, 4],   // Individuals with zero parents
  [5, 7, 8, 9] // Individuals with exactly one parent
]
 */

// (parent,child); (1,3) (2,3)
// 
class Solution {
  public static void main(String[] args) {
    int[][] parentChildPairs = new int[][] {
        {1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7},
        {4, 5}, {4, 8}, {8, 9}, {100, 8}
    };
    System.out.println(getData(parentChildPairs));
    //stem.out.println();
  }
  public static ArrayList<ArrayList<Integer>> getData(int[][]input){
       //map(key,value); 
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < input.length; i++){
      int count = map.containsKey(input[i][1]) ? map.get(input[i][1]) : 0;
       map.put(input[i][1], count+1); 
    }
     
    ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
    
    ArrayList<Integer> noParents = new ArrayList<>();
    for(int i = 0; i < input.length; i ++){
      int temp = input[i][0];
      if(!map.containsKey(temp)&&!noParents.contains(temp)){
         noParents.add(temp);   
      } 
    }
    output.add(noParents);
    ArrayList<Integer> oneParent = new ArrayList<>();
    
    for(int i = 0; i < input.length; i++){
      int count = map.containsKey(input[i][1]) ? map.get(input[i][1]) : 0;
      if(count == 1){
        oneParent.add(input[i][1]);   
      }  
    }
      output.add(oneParent); 
    //System.out.println(Arrays.asList(map));  
    return output;
  }
}
